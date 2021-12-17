package ZY6;

public class Circle extends GeometricObject{
	private double r;
	public Circle() {
		
	}
	public Circle(double r) {
		this.r=r;
	}
	public Circle(double r,String color,boolean filled) {
		this.r=r;
		setColor(color);
		setFilled(filled);
	}
	public double getR(){
		return r;
	}
	public void setR(double r){
		this.r=r;
	}
	public double getArea() {
		return r*r*Math.PI;
	}
	public double getDiameter() {
		return 2*r;
	}
	public double getPerimeter() {
		return 2*r*Math.PI;
	}
	public void printCircle() {
		System.out.println("The circle is created "+getDateCreated()+" and the r is "+r);
	}
}
