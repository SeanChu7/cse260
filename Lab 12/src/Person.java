import java.util.ArrayList;
public class Person {

	public enum Sex {
		MALE, FEMALE
		}
	String name;
	Sex gender;
	String emailAddress;
	public Person(String s, Sex g) {
		name = s;
		gender = g;
	}
	public String getName() {
		return name;
	}
	public Sex getGender() {
		return gender;
	}
	public static void main(String[] args) {
		ArrayList<Person> roster = new ArrayList<Person>();
		roster.add(new Person("terry", Sex.MALE));
		roster.add(new Person("terlo", Sex.MALE));
		roster.add(new Person("terin", Sex.MALE));
		roster.add(new Person("terse", Sex.FEMALE));
		roster.add(new Person("terere", Sex.FEMALE));
		roster.stream()
		.filter(e -> e.getGender() == Person.Sex.MALE)
		.forEach(e -> System.out.println(e.getName()));
		
	}
}
