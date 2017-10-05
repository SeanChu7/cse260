
public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		x = 0.0;
		y = 0.0;
	}
	public MyPoint(double z, double w) {
		x = z;
		y = w;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double getDistance(MyPoint p) {
		double xval = x - p.getX();
		double yval = y - p.getY();
		return Math.sqrt(Math.pow(xval, 2.0) + Math.pow(yval, 2.0));
	}
	
	public double getDistance(double z, double w) {
		MyPoint hold = new MyPoint(z,w);
		return getDistance(hold);
	}
}
