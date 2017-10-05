
public class TheComplex {

	private double Real;
	private double Imaginary;
	
	public TheComplex(double a) {
		Real = a;
		Imaginary = 0;
	}
	public TheComplex() {
		Real = 0;
		Imaginary = 0;
	}
	public TheComplex(double a,double b) {
		Real = a;
		Imaginary = b;
	}
	public double getReal() {
		return Real;
	}
	public double getImaginary() {
		return Imaginary;
	}
	
	public String toString() {
		if (Imaginary == 0)
			return Double.toString(Real);
		return Double.toString(Real) + " + " + Double.toString(Imaginary) + "i";
	}
	
	public TheComplex add(TheComplex b) {
		double placeholder = b.getReal() + Real;
		double placeholderI = b.getImaginary() + Imaginary;
		return new TheComplex(placeholder,placeholderI);
	}
	
	public TheComplex subtract(TheComplex b) {
		double placeholder = Real - b.getReal();
		double placeholderI = Imaginary - b.getImaginary();
		return new TheComplex(placeholder,placeholderI);
	}
	
	public TheComplex multiply(TheComplex b) {
		double placeholder = (b.getReal()*Real) - (b.getImaginary()*Imaginary);
		double placeholderI = b.getImaginary()*Real + Imaginary*b.getReal();
		return new TheComplex(placeholder,placeholderI);
	}
	
	public TheComplex divide(TheComplex b) {
		double placeholder = ((b.getReal()*Real)+(b.getImaginary()*Imaginary))/(Math.pow(b.getReal(), 2)+(double)Math.pow(b.getImaginary(), 2));
		double placeholderI = ((b.getReal()*Imaginary)-(b.getImaginary()*Real))/(Math.pow(b.getReal(), 2)+(double)Math.pow(b.getImaginary(), 2));
		return new TheComplex(placeholder,placeholderI);
	}
}
