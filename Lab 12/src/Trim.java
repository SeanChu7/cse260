import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class Trim{

	public static void trim(List<String> l ) {
		ListIterator<String> iter = l.listIterator();
		while (iter.hasNext()) {
			iter.set(iter.next().trim());
		}
	}
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Serwlkj");
		l.add("     ds");
		l.add("ddasd    ");
		l.add("    dlkfnsf flaksd ew    ");
		Trim.trim(l);
		System.out.println(l);
	}
}
