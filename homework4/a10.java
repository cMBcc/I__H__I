package ZY4;

public class a10 {
	public static void main(String[] args) {
		CCCC c=new CCCC(1);
		int n=5;
		printAreas(c,n);
		System.out.println("\n"+"r is "+c.getR());
		System.out.println("n is "+n);
	}
	public static void printAreas(CCCC c,int times) {
		System.out.println("r \t\tArea");
		while(times>=1) {
			System.out.println(c.getR()+"\t\t"+c.getArea());
			c.setR(c.getR()+1.0);
			times--;
		}
	}
}
