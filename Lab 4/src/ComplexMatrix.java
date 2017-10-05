
public class ComplexMatrix extends GenericMatrix<TheComplex> {
	
	public TheComplex add(TheComplex o1, TheComplex o2) {
		return o1.add(o2);
	}
	public TheComplex multiply(TheComplex o1, TheComplex o2) {
		return o1.multiply(o2);
	}
	public TheComplex zero() {
		return new TheComplex();
	}
	
	public static void main(String[] args) {
	TheComplex a = new TheComplex(1,2);
	TheComplex b = new TheComplex(2,2);
	TheComplex c = new TheComplex(3,2);
	TheComplex d = new TheComplex(4,2);
	TheComplex e = new TheComplex(1,4);
	TheComplex f = new TheComplex(8,2);
	TheComplex g = new TheComplex(3,2);
	TheComplex h = new TheComplex(1,3);
	TheComplex i = new TheComplex(1,5);
	TheComplex j = new TheComplex(4,5);
	TheComplex k = new TheComplex(2,3);
	TheComplex l = new TheComplex(1,7);
	TheComplex m = new TheComplex(1,1);
	TheComplex n = new TheComplex(3,2);
	TheComplex o = new TheComplex(5,6);
	TheComplex q = new TheComplex(2,3);
	TheComplex r = new TheComplex(7,8);
	TheComplex s = new TheComplex(3,2);
	TheComplex t = new TheComplex(5,6);
	TheComplex u = new TheComplex(2,4);
	TheComplex v = new TheComplex(2,9);
	TheComplex[][] test= new TheComplex[][] {{a,b,c},{d,e,f},{g,h,i}};
	TheComplex[][] test1= new TheComplex[][] {{j,k,l},{m,n,o},{q,r,s}};
	ComplexMatrix testing = new ComplexMatrix();
	GenericMatrix.printResult(test, test1, testing.addMatrix(test,test1), '+');
	System.out.println("\n");
	GenericMatrix.printResult(test, test1, testing.multiplyMatrix(test,test1), '*');
	}
}
