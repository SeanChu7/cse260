import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class CountOccurrenceOfWords{

	public class WordOccurrence implements Comparable<WordOccurrence>{
		public String word;
		public int count;
		public WordOccurrence(String w, int c) {
			word = w;
			count = c;
			
		}
		public int compareTo(WordOccurrence i) {
			if (count < i.count)
				return -1;
			else if(count == i.count)
				return 0;
			return 1;
		}
	}
	
	public static void count() {
		System.out.println("Type the file Path");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		HashSet<WordOccurrence> holder = new HashSet<WordOccurrence>();
		try {
			s = new Scanner(new File(input));
			s.useDelimiter("[\\s;,?.:\"()]");
			while (s.hasNext()) {
				input = s.next();
				
			}
		}
	}
}
