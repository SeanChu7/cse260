import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
public class NonduplicateWords {
	// Utter Nonsense
	/* new Throwing things off
	*/
	public static void nonDuplicate() {
		System.out.println("Enter File Path");
		Scanner s = new Scanner(System.in); 
		String result = s.nextLine();
		try {
		s = new Scanner(new File(result));
		TreeSet<String> hold = new TreeSet<String>();
		while (s.hasNextLine()) {
			hold.add(s.nextLine());
		}
		Iterator<String> i = hold.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		}
		catch (FileNotFoundException e) {
			System.out.println("Invalid Path");
		}
	}
String[] keywordString= {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const","continue", "default", "do", "double", "else", "enum","extends", "for", "final", "finally", "float", "goto","if", "implements", "import", "instanceof", "int",
"interface", "long", "native", "new", "package", "private","protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this","throw", "throws", "transient", "try", "void", "volatile","while", "true", "false", "null"};
	public static void main(String[] args) {
		NonduplicateWords.nonDuplicate();
	}
}
