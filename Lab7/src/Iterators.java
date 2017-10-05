import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Iterators {

	
	public static void main(String[] args) {
		LinkedList<Integer> test = new LinkedList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50000; i++) {
			test.add(r.nextInt(100000000));
		}
		long start = System.currentTimeMillis();
		Iterator<Integer> it = test.iterator();
		while(it.hasNext()) {
			it.next();
		}
		System.out.println(System.currentTimeMillis() -  start);
		start = System.currentTimeMillis();
		for (int i = 0; i < test.size(); i++) {
			test.get(i);
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
