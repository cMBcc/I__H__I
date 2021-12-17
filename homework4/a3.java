package ZY4;
import java.util.Scanner;

public class a3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		Point p1=new Point(x1,y1);
		Point p2=new Point(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("the dist from p1 to p2 is"+p1.Dist(p2));
		System.out.println("the midpoint of p1 and p2 is "+p1.mid(p2).toString());
	}
	
}
