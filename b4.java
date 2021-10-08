package hello;
import java.util.Scanner;
public class b4 {
	public static void main(String[] args) {
		final double PI=3.14159;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		System.out.println("r= "+radius+" area is "+area);
	}

}
