import java.util.Scanner;
import java.util.HashMap;
public class NumberOccurrences {

	public static void count() {
		System.out.println("Type numbers, Enter E when finished");
		Scanner s = new Scanner(System.in);
		boolean running = true;
		HashMap<Integer,Integer> holder = new HashMap<Integer,Integer>();
		while (running) {
			String input = s.nextLine();
			if (input.equals("E")) {
				running = false;
				continue;
			}
			int value = Integer.parseInt(input);
			if (holder.containsKey(value))
				holder.put(value, holder.get(value)+1);
			else
				holder.put(value, 1);
		}
		int mode = 0;
		for (Integer value: holder.values()) {
			if (value > mode)
				mode = value;
		}
		for (Integer key: holder.keySet()) {
			if (holder.get(key) == mode)
				System.out.println(key);
		}
	}
	public static void main(String[] args) {
		NumberOccurrences.count();
	}
}
