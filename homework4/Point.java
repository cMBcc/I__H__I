package ZY4;

public class Point {
	private double x;
	private double y;
	public Point() {
		x=0;
		y=0;
	}
	public Point(double x1,double y1) {
		x=x1;
		y=y1;
	}
	public String toString() {
		String ans="";
		ans="x is "+x+" y is "+y;
		return ans;
	}
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	public double Dist(Point p) {
		double x1=p.getx();
		double y1=p.gety();
		double ans=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		return ans;
	}
	public Point mid(Point p) {
		double x1=p.getx();
		double y1=p.gety();
		return new Point((x+x1)/2.0,(y+y1)/2.0);
	}
}
