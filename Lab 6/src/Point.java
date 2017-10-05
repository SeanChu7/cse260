
public class Point implements Comparable<Point>{
	private int xcor;
	private int ycor;
	
	public Point (int x , int y) {
		xcor = x;
		ycor = y;
	}
	public int getX() {
		return xcor;
	}
	public int getY() {
		return ycor;
	}
	public String toString() {
		return "X: " + xcor + " Y: " + ycor;
	}
	public int compareTo(Point p) {
		if (p.getX() ==  getX()) {
			if (getY() < p.getY())
				return -1;
			else if (getY() == p.getY())
				return 0;
			else {
				return 1;
			}
		}
		if (getX() < p.getX())
			return -1;
		else if (getX() == p.getX())
			return 0;
		else {
			return 1;
		}
	}
}
