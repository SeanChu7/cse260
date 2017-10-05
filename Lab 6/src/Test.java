import java.util.Arrays;
import java.util.Random;
public class Test {
	public static void main(String[] args) {
		Random r = new Random();
		Point[] test = new Point[100];
		for (int i = 0; i < test.length; i++) {
			test[i] = new Point(r.nextInt(100),r.nextInt(100));
		}
		Arrays.sort(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("\n" + "Y test");
		Arrays.sort(test,new CompareY());
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
	}
}
