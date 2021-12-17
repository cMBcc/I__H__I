package ZY4;

public class CCCC {
	private double r=1;
	private static int numberOfObjects=0;
	public CCCC() {
		numberOfObjects++;
	}
	public CCCC(double R) {
		r=R;
		numberOfObjects++;
	}
	public double getR() {
		return r;
	}
	public void setR(double R) {
		r=(R>=0?R:0);
	}
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	public double getArea() {
		return r*r*Math.PI;
	}
}
