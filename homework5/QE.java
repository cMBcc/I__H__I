package ZY5;

public class QE {
	private double a;
	private double b;
	private double c;
	public QE(double A,double B,double C) {
		a=A;
		b=B;
		c=C;
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	public double getc() {
		return c;
	}
	public double getdat() {
		return b*b-4*a*c;
	}
	public double getx1() {
		if(getdat()<0)return 0;
		return (-b+Math.sqrt(getdat()))/(2*a);
	}
	public double getx2() {
		if(getdat()<0)return 0;
		return (-b-Math.sqrt(getdat()))/(2*a);
	}
}
