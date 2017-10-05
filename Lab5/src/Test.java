import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String");
		GenericStack<String> test = new GenericStack<String>();
		test.add(s.nextLine());
		System.out.println("Enter the second String");
		test.add(s.nextLine());
		System.out.println("Enter the third String");
		test.add(s.nextLine());
		System.out.println("Enter the fourth String");
		test.add(s.nextLine());
		System.out.println("Enter the fifth String");
		test.add(s.nextLine());
		for (int i= 0; i < 5; i++) {
			System.out.println(test.pop());
		}
		
		System.out.println("\n"+"Testing Max");
		Integer[] testing = new Integer[]{1,1,2,3,4,5,6,7,8,9};
		Integer[] testing1 = new Integer[] {123,424,673,334,242};
		Double[] testing2 = new Double[] {1.2,324.0,43.53,2345.765};
		System.out.println(Max.max(testing));
		System.out.println(Max.max(testing1));
		System.out.println(Max.max(testing2));
		System.out.println("\n" + "Testing BinarySearch");
		Integer[] test1 = new Integer[] {1,2,3,4,5,6,7,8,9};
		Double[] test2 = new Double[] {5.0,6.0,9.0,10.23,12.5,12.64};
		System.out.println(BinarySearch.binarySearch(test1, 3));
		System.out.println(BinarySearch.binarySearch(test2, 12.5));
	}
}
