package ZY4;

public class a7 {
	public static void main(String[] args) {
		System.out.println("numberOfObjects is "+Cir.numberOfObjects);
		Cir c1=new Cir();
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects);
		Cir c2=new Cir(5);
		c1.r=9;
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects);
		System.out.println("c2 r is"+c2.r+" numberOfObjects is "+c2.numberOfObjects);
	}
}
