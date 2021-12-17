package ZY5;

public class Polygon {
	private int n;
	private double side;
	private double x;
	private double y;
	public Polygon() {
		n=3;
		side=1;
		x=0;
		y=0;
	}
	public Polygon(int N,double len) {
		n=N;
		side=len;
		x=0;
		y=0;
	}
	public Polygon(int N,double len,double X,double Y) {
		n=N;
		side=len;
		x=X;
		y=Y;
	}
	public double getPer() {
		return n*side;
	}
	public double getArea() {
		double ans=(double)(n)*side*side/4.0/Math.tan(Math.PI/(double)(n));
		return ans;
	}
}
