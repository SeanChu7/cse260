import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadText {

	public static void readText() {
		ArrayList<String> words = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Type the File name");
		String temp = s.nextLine();
		try {
		s = new Scanner(new File(temp));
		String t = s.nextLine();
		while(s.hasNextLine()) {
			words.add(t);
			t = s.nextLine();
		}
		words.add(t);
		int hold = words.size();
		for (int g = 0; g < hold; g++) {
			temp = words.get(0);
			for (int i = 0; i < words.size(); i++) {
				if(temp.compareTo(words.get(i))> 0)
					temp = words.get(i);
			}
			System.out.println(temp);
			words.remove(temp);
		}}
		catch(FileNotFoundException e){
			System.out.println("File Not found");
		}
	}
	public static void main(String[] args) {
		ReadText.readText();
	}
}


