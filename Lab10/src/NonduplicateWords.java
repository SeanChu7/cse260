import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
public class NonduplicateWords {

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
	public static void main(String[] args) {
		NonduplicateWords.nonDuplicate();
	}
}
