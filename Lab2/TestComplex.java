import java.util.Scanner;
public class TestComplex {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Input the Real Part of the 1st Complex Number");
		double a = Double.parseDouble(s.nextLine());
		System.out.println("Input the Imaginary Part of the 1st Complex Number");
		double b = Double.parseDouble(s.nextLine());
		System.out.println("Input the Real Part of the 2nd Complex Number");
		double c = Double.parseDouble(s.nextLine());
		System.out.println("Input the Imaginary Part of the 2nd Complex Number");
		double d = Double.parseDouble(s.nextLine());
		
		TheComplex First = new TheComplex(a,b);
		TheComplex Second = new TheComplex(c,d);
		System.out.println("The First Complex Number: " + First);
		System.out.println("The Second Complex Number: " + Second);
		
		System.out.println("Addition");
		System.out.println(First.add(Second));
		System.out.println("First - Second");
		System.out.println(First.subtract(Second));
		System.out.println("Second - First");
		System.out.println(Second.subtract(First));
		System.out.println("Multiplication");
		System.out.println(First.multiply(Second));
		System.out.println("First/Second");
		System.out.println(First.divide(Second));
		s.close();
	}
}
