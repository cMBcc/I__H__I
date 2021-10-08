package hello;
import java.util.Scanner;
public class b3 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter tree numbers: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double ans=(num1+num2+num3)/3.0;
		
		
		System.out.println("The average of"+num1+" "+num2+" "+num3+" is "+ans);
	}

}
