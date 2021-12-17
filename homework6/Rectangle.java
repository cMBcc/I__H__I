package ZY6;

public class Rectangle extends GeometricObject{
	public double w;
	public double h;
	public Rectangle() {
		
	}
	public Rectangle(double w,double h) {
		this.w=w;
		this.h=h;
	}
	public Rectangle(double w,double h,String color,boolean filled) {
		this.w=w;
		this.h=h;
		setColor(color);
		setFilled(filled);
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w=w;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h=h;
	}
	public double getArea() {
		return w*h;
	}
	public double getPerimeter() {
		return 2*h+2*w;
	}
	
}
