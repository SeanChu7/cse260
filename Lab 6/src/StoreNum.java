import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
public class StoreNum {

	public static void storeNum() {
		System.out.println("Input Numbers to be added to the List, Input N when finished");
		LinkedList<Integer> nums = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		while (!s1.equals("N")) {
			if (!nums.contains(Integer.parseInt(s1))) {
				nums.add(Integer.parseInt(s1));
			}
			s1 = s.nextLine();
		}
		boolean running = true;
		while (running) {
			System.out.println("Your Numbers: " + nums);
			System.out.println("Input the Following to Change the List");
			System.out.println("1. Shuffle");
			System.out.println("2. Sort");
			System.out.println("3. Reverse");
			System.out.println("4. Quit");
			String temp = s.nextLine();
			if (temp.equals("1")) {
				Random r = new Random();
				for (int i = 0; i < nums.size(); i++) {
					int re = r.nextInt(nums.size());
					Integer hold = nums.get(re);
					nums.set(re, nums.get(i));
					nums.set(i, hold);
				}
				//System.out.println(nums);
			}
			else if (temp.equals("2")) {
				Collections.sort(nums);
				//System.out.println(nums);
			}
			else if (temp.equals("3")) {
				LinkedList<Integer> temp1 = new LinkedList<Integer>();
				while(!nums.isEmpty()) {
					temp1.add(nums.removeLast());
				}
				nums = temp1;
				//System.out.println(nums);
			}
			else {
				running = false;
			}
		}
		s.close();
	}
	public static void main(String[] args) {
		StoreNum.storeNum();
	}
}
