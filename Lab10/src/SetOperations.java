import java.util.LinkedHashSet;
import java.util.Arrays;
public class SetOperations {

	public static LinkedHashSet<String> union(LinkedHashSet<String> s1, LinkedHashSet<String> s2){
		LinkedHashSet<String> result = (LinkedHashSet<String>)(s1.clone());
		result.addAll(s2);
		return result;
	}
	public static LinkedHashSet<String> difference(LinkedHashSet<String> s1, LinkedHashSet<String> s2){
		LinkedHashSet<String> result = (LinkedHashSet<String>)(s1.clone());
		result.removeAll(s2);
		return result;
	}
	
	
	public static LinkedHashSet<String> intersect(LinkedHashSet<String> s1, LinkedHashSet<String> s2){
		LinkedHashSet<String> result = (LinkedHashSet<String>)(s1.clone());
		result.retainAll(s2);
		return result;
	}
	
	public static void main (String[] args) {
		String[] temp =  {"George","Jim","John", "Blake", "Kevin", "Michael"};
		String[] temp2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		LinkedHashSet<String> test = new LinkedHashSet<String>(Arrays.asList(temp));
		LinkedHashSet<String> test2 = new LinkedHashSet<String>(Arrays.asList(temp2));
		System.out.println(SetOperations.union(test, test2));
		System.out.println(SetOperations.difference(test, test2));
		System.out.println(SetOperations.intersect(test, test2));
	}
}
