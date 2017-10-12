import java.util.Scanner;
import java.util.HashMap;
public class GuessCapitals {

	public static void guess() {
		HashMap<String,String> state = new HashMap<String,String>();
		String[][] states =  {
		        {"Alabama", "Montgomery"},
		        {"Alaska", "Juneau"},
		        {"Arizona", "Phoenix"},
		        {"Arkansas", "Little Rock"},
		        {"California", "Sacramento"},
		        {"Colorado", "Denver"},
		        {"Connecticut", "Hartford"},
		        {"Delaware", "Dover"},
		        {"Florida", "Tallahasse"},
		        {"Georgia", "Atlanta"},
		        {"Hawaii", "Honolulu"},
		        {"Idaho", "Boise"},
		        {"Illinois", "Springfield"},
		        {"Indiana", "Indianapolis"},
		        {"Iowa", "Des Moines"},
		        {"Kansas", "Topeka"},
		        {"Kentucky", "Frankfort"},
		        {"Louisiana", "Baton Rouge"},
		        {"Maine", "Augusta"},
		        {"Maryland", "Annapolis"},
		        {"Massachusettes", "Boston"},
		        {"Michigan", "Lansing"},
		        {"Minnesota", "Saint Paul"},
		        {"Mississippi", "Jackson"},
		        {"Missouri", "Jefferson City"},
		        {"Montana", "Helena"},
		        {"Nebraska", "Lincoln"},
		        {"Nevada", "Carson City"},
		        {"New Hampshire", "Concord"},
		        {"New Jersey", "Trenton"},
		        {"New York", "Albany"},
		        {"New Mexico", "Santa Fe"},
		        {"North Carolina", "Raleigh"},
		        {"North Dakota", "Bismark"},
		        {"Ohio", "Columbus"},
		        {"Oklahoma", "Oklahoma City"},
		        {"Oregon", "Salem"},
		        {"Pennslyvania", "Harrisburg"},
		        {"Rhode Island", "Providence"},
		        {"South Carolina", "Columbia"},
		        {"South Dakota", "Pierre"},
		        {"Tennessee", "Nashville"},
		        {"Texas", "Austin"},
		        {"Utah", "Salt Lake City"},
		        {"Vermont", "Montpelier"},
		        {"Virginia", "Richmond"},
		        {"Washington", "Olympia"},
		        {"West Virginia", "Charleston"},
		        {"Wisconsin", "Madison"},
		        {"Wyoming", "Cheyenne"}
		};
		for (int i=0; i < states.length; i++) {
			state.put(states[i][0].toUpperCase(), states[i][1]);
		}
		System.out.println("Type in a State");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine().toUpperCase();
		if (state.containsKey(input)) {
			System.out.println(state.get(input));
		}
		else {
			System.out.println("Not a State");
		}
	}
	public static void main(String[] args) {
		GuessCapitals.guess();
	}
}
