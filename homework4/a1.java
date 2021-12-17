package ZY4;

public class a1 {
	public static void main(String[] args) {
		Circle c1=new Circle();
		System.out.println("the circle1 r is:"+c1.r+" area is:"+c1.getArea());
		Circle c2=new Circle(25);
		System.out.println("the circle2 r is:"+c2.r+" area is:"+c2.getArea());
		Circle c3=new Circle(125);
		System.out.println("the circle3 r is:"+c3.r+" area is:"+c3.getArea());
		c2.r=100;
		System.out.println("the circle2 r is:"+c2.r+" area is:"+c2.getArea());
	}
}
class Circle{
	double r;
	Circle(){
		r=1;
	}
	Circle(double R){
		r=R;
	}
	double getArea() {
		return r*r*Math.PI;
	}
	double getPerimeter() {
		return 2.0*r*Math.PI;
	}
	void setR(double R) {
		r=R;
	}
}
