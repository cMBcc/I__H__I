package ZY4;

public class a8 {
	public static void main(String[] args) {
		CCCC c=new CCCC(5.0);
		System.out.println("circle r is "+c.getR()+" area is "+c.getArea());
		c.setR(c.getR()*1.1);
		System.out.println("circle r is "+c.getR()+" area is "+c.getArea());
		System.out.println("circle number of objects is "+c.getNumberOfObjects());
	}
	
}
