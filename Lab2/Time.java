import java.util.Calendar;
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	public Time(long x) {
		long totalSeconds = x/1000;
		second = (int)totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		minute = (int)totalMinutes%60;
		long totalHours = totalMinutes/60;
		hour = (int)totalHours%24;
	}
	public int getSecond() {
		return second;
	}
	public int getMinute() {
		return minute;
	}
	public int getHour() {
		return hour;
	}
	
	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime/1000;
		second = (int)totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		minute = (int)totalMinutes%60;
		long totalHours = totalMinutes/60;
		hour = (int)totalHours%24;
	}
}

