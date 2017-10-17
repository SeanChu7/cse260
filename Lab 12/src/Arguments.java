import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;
public class Arguments {

	public static void main(String[] args) {
		SortedSet<String> holder = new TreeSet<String>(new Comparator<String>(){
			public int compare(String s1, String s2) {
				return s1.toUpperCase().compareTo(s2.toUpperCase());
			}
		});
		for(String s: args) {
			holder.add(s);
		}
		holder.stream()
		.forEach(e -> System.out.println(e));
	}
}
