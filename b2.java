package hello;
import java.util.Scanner;
public class b2 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius=input.nextDouble();
		double area=radius*radius*3.14159;
		System.out.println("r= "+radius+" area is "+area);
	}

}
