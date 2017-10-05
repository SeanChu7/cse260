import java.util.ArrayList;

public class Lab3 {

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E key;
		for (int i = 1; i < list.size(); i++) {
			for (int g = i; g > 0; g--) {
				if (list.get(g).compareTo(list.get(g-1)) < 0){
					key = list.get(g);
					list.set(g, list.get(g-1));
					list.set(g-1, key);
				}
			}
		}
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max.compareTo(list.get(i)) < 0) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(10);
		ints.add(5);
		ints.add(3);
		Lab3.sort(ints);
		System.out.println(ints.toString());
		System.out.println(Lab3.max(ints));
		
	}
}
