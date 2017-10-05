
public class TestMyInteger {
	public static void main(String[] args) {
		MyInteger test = new MyInteger(2);
		MyInteger test1 = new MyInteger(3);
		MyInteger test2 = new MyInteger(10);
	
		System.out.println("Testing with 2");
		System.out.println(test.getValue());
		System.out.println(test.isEven());
		System.out.println(test.isOdd());;
		System.out.println(test.isPrime());
		
		System.out.println("\n"+"Testing with 3");
		System.out.println(test1.getValue());
		System.out.println(test1.isEven());
		System.out.println(test1.isOdd());;
		System.out.println(test1.isPrime());
		
		System.out.println("\n"+"Testing with 10");
		System.out.println(test2.getValue());
		System.out.println(test2.isEven());
		System.out.println(test2.isOdd());;
		System.out.println(test2.isPrime());
		
		System.out.println("\n"+"Testing with 2");
		System.out.println(MyInteger.isEven(2));
		System.out.println(MyInteger.isOdd(2));;
		System.out.println(MyInteger.isPrime(2));
		
		System.out.println("\n"+"Testing with 3");
		System.out.println(MyInteger.isEven(3));
		System.out.println(MyInteger.isOdd(3));;
		System.out.println(MyInteger.isPrime(3));
		
		System.out.println("\n"+"Testing with 10");
		System.out.println(MyInteger.isEven(10));
		System.out.println(MyInteger.isOdd(10));;
		System.out.println(MyInteger.isPrime(10));
		
		System.out.println("\n"+"Testing with 2");
		System.out.println(MyInteger.isEven(test));
		System.out.println(MyInteger.isOdd(test));;
		System.out.println(MyInteger.isPrime(test));
		
		System.out.println("\n"+"Testing with 3");
		System.out.println(MyInteger.isEven(test1));
		System.out.println(MyInteger.isOdd(test1));;
		System.out.println(MyInteger.isPrime(test1));
		
		System.out.println("\n"+"Testing with 10");
		System.out.println(MyInteger.isEven(test2));
		System.out.println(MyInteger.isOdd(test2));;
		System.out.println(MyInteger.isPrime(test2));
		
		System.out.println("\n" + "Testing Equals");
		System.out.println(test.equals(2));
		System.out.println(test.equals(3));
		MyInteger test3 = new MyInteger(2);
		System.out.println(test.equals(test3));
		System.out.println(test.equals(test1));
		
		System.out.println("\n"+"Testing ParseInt");
		System.out.println(MyInteger.parseInt("15"));
		System.out.println(MyInteger.parseInt("12435512"));
		System.out.println(MyInteger.parseInt("-152"));
	}
}
