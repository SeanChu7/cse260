import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
public class Letters {

	public static void findLetters() {
		System.out.println("Enter the File Name");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		try {
			s = new Scanner(new File(name));
			HashMap<Character,Integer> vowels = new HashMap<Character,Integer>();
			HashMap<Character,Integer> consonants = new HashMap<Character,Integer>();
			int numConsonat = 0;
			Character[] vowel = {'A','E','I','O','U'};
			Character[] consonant = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
			for (int i = 0; i < vowel.length; i++) {
				vowels.put(vowel[i], 0);
			}
			for (int i = 0; i < consonant.length; i++) {
				consonants.put(consonant[i], 0);
			}
			while (s.hasNextLine()) {
				String result = s.nextLine();
				for (int i = 0; i < result.length(); i++) {
					if (vowels.containsKey(Character.toUpperCase(result.charAt(i))))
						vowels.put(Character.toUpperCase(result.charAt(i)), vowels.get(Character.toUpperCase(result.charAt(i)))+1);
					else if (consonants.containsKey(Character.toUpperCase(result.charAt(i))))
						consonants.put(Character.toUpperCase(result.charAt(i)), consonants.get(Character.toUpperCase(result.charAt(i)))+1);
				}
			}
			int numVowel = 0;
			for (Integer values: vowels.values()) {
				numVowel+= values;
			}
			for (Integer values: consonants.values()) {
				numConsonat+= values;
			}
			System.out.println("Number of vowels is: " +numVowel);
			System.out.println("Number of consonants is: " + numConsonat);
		}
		catch(FileNotFoundException e) {
			System.out.println("Invalid Path");
		}
	}
	public static void main(String[] args) {
		Letters.findLetters();
	}
}
