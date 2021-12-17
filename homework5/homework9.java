package ZY5;

public class homework9 {
	public static void main(String[] args) {
		Polygon poly1=new Polygon();
		Polygon poly2=new Polygon(6,4);
		Polygon poly3=new Polygon(10,4,5.6,7.8);
		System.out.println("poly1:zc="+poly1.getPer()+" area="+poly1.getArea());
		System.out.println("poly2:zc="+poly2.getPer()+" area="+poly2.getArea());
		System.out.println("poly3:zc="+poly3.getPer()+" area="+poly3.getArea());
	}
}
