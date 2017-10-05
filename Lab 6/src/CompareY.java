import java.util.Comparator;
public class CompareY implements Comparator<Point>{
	public int compare(Point g, Point p) {
		if (p.getY() ==  g.getY()) {
			if (g.getX() < p.getX())
				return -1;
			else if (g.getX() == p.getX())
				return 0;
			else {
				return 1;
			}
		}
		if (g.getY() < p.getY())
			return -1;
		else if (g.getY() == p.getY())
			return 0;
		else {
			return 1;
		}
	}
}
