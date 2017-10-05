
public class TestTime {

	public static void main(String[] args) {
		Time t = new Time();
		Time t1 = new Time(555550000);
		
		System.out.println("Time with no Arguments, H:M:S");
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		
		System.out.println("Time 555550000, H:M:S");
		System.out.println(t1.getHour());
		System.out.println(t1.getMinute());
		System.out.println(t1.getSecond());
	}
}
