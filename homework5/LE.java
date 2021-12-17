package ZY5;

public class LE {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	public LE(double A,double B,double C,double D,double E,double F) {
		a=A;
		b=B;
		c=C;
		d=D;
		e=E;
		f=F;
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
	public double getd() {
		return d;
	}
	public double gete() {
		return e;
	}
	public double getf() {
		return f;
	}
	public boolean isSolvable() {
		return a*d-b*c==0;
	}
	public double getx() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double gety() {
		return (a*f-e*c)/(a*d-b*c);
	}
}
