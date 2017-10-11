import java.util.Scanner;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CountKeywords {

	public static int count() {
		System.out.println("Type Path");
		Scanner s = new Scanner(System.in);
		String result  = s.nextLine();
		try {
			s = new Scanner(new File(result));
			int count = 0;
			Stack<String> Holder = new Stack<>();
			String[] keywordString= {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const","continue", "default", "do", "double", "else", "enum","extends", "for", "final", "finally", "float", "goto","if", "implements", "import", "instanceof", "int",
"interface", "long", "native", "new", "package", "private","protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this","throw", "throws", "transient", "try", "void", "volatile","while", "true", "false", "null"};
			Set<String> keywordSet= new HashSet<>(Arrays.asList(keywordString));
			while (s.hasNext()) {
				String line = s.next();
				System.out.println(line);
				if (line.startsWith("//")) {
					s.nextLine();
					continue;
				}	
				if (line.startsWith("\""))
					Holder.add("\"");
				if (line.endsWith("\"") && Holder.peek().equals("\""))
					Holder.remove("\"");
				if (line.startsWith("/*"))
					Holder.add("/*");
				if (line.startsWith("*/") || line.endsWith("*/") && Holder.peek().equals("/*"))
					Holder.remove("/*");
				if (Holder.isEmpty() && keywordSet.contains(line)) {
					count++;
				}
			}
			return count;
		}
		catch(FileNotFoundException e) {
			System.out.println("Invalid Path");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(CountKeywords.count());
	}
}
