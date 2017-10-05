
public class MyInteger {
	private int value;
	
	public MyInteger(int g) {
		value = g;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if (value%2 == 0) {
			return true;
		}
		return false;
	}
	public boolean isOdd() {
		if (value%2 == 1) {
			return true;
		}
		return false;
	}
	public boolean isPrime() {
		for (int i = 2; i <= value/2; i++) {
			if (value%i == 0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isEven(int i) {
		if (i%2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(int i) {
		if (i%2 == 1) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(int i) {
		for (int g = 2; g <= i/2; g++) {
			if (i%g == 0) {
				return true;
			}
		}
		return false;
	}
	public static boolean isEven(MyInteger i) {
		if (i.getValue()%2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger i) {
		if (i.getValue()%2 == 1) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(MyInteger i) {
		for (int g = 2; g <= i.getValue()/2; g++) {
			if (i.getValue()%g == 0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(int i) {
		if (value == i) 
			return true;
		return false;
	}
	public boolean equals(MyInteger i) {
		if (i.getValue() == value)
			return true;
		return false;
	}
	
	public static int parseInt(String s) {
		int result = 0;
		int z = 0;
		boolean negative = false;
		if (s.charAt(0) == '-') {
			negative = true;
			z = 1;
		}
		for (int i = z; i < s.length(); i++) {
			int c = s.charAt(i)-'0';
			result += c*Math.pow(10, s.length()-1-i);
		}
		if (negative)
			result *= -1;
		return result;
	}
}
