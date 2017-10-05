
public class TestMyPoint {
	public static void main(String[] args) {
		
	MyPoint test = new MyPoint();
	MyPoint test1 = new MyPoint(10,30.5);
	
	System.out.println("Testing distance from 0,0 to 10,30.5");
	System.out.println(test.getDistance(test1));
	System.out.println("Testing distance from 0,0 t0 10,30.5");
	System.out.println(test.getDistance(10,30.5));
	
	
	}
}
