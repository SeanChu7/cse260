import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class CompetingList {

	public static void main(String[] args) {
		LinkedList<Integer> test = new LinkedList<Integer>();
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		Random r = new Random();
		int[] test2 = new int[50000];
		System.out.println("Storing");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			int g = r.nextInt(1000000);
			test.add(g);
		}
		long end = System.currentTimeMillis()-start;
		System.out.println("LinkedList: " + end);
		start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			int g = r.nextInt(1000000);
			test1.add(g);
		}
		end = System.currentTimeMillis()-start;
		System.out.println("ArrayList: " + end);
		start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			int g = r.nextInt(1000000);
			test2[i] = g;
		}
		end = System.currentTimeMillis()-start;
		System.out.println("Array: " + end);
		Iterator<Integer> it = test.iterator();
		Iterator<Integer> it1 = test1.iterator();
		System.out.println("\n" + "Traversing");
		start = System.currentTimeMillis();
		while(it.hasNext()) {
			it.next();
		}
		end = System.currentTimeMillis()-start;
		System.out.println("Time for LinkedList: " + end);
		start = System.currentTimeMillis();
		while(it1.hasNext()) {
			it1.next();
		}
		end = System.currentTimeMillis() - start;
		System.out.println("Time for ArrayList: " + end);
		start = System.currentTimeMillis();
		for (int i = 0; i < test2.length; i++) {
		}
		end = System.currentTimeMillis() - start;
		System.out.println("Time for Array: " + end);
		System.out.println("\n" + "Removing");
		start = System.currentTimeMillis();
		it = test.iterator();
		it1 = test1.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		end = System.currentTimeMillis()-start;
		System.out.println("LinkedList: " + end);
		start = System.currentTimeMillis();
		while(it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		end = System.currentTimeMillis()-start;
		System.out.println("ArrayList: " + end);
		start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			test2[i] = 0;
		}
		end = System.currentTimeMillis()-start;
		System.out.println("Array: " + end);
	} 
}
