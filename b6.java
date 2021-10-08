package hello;
import java.util.Scanner;
public class b6 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a degree in F: ");
		double s=input.nextDouble();
		double ans=(5.0/9)*(s-32); 
		
		System.out.println("Fahrenheit is "+s+" is "+ans+" in Ceelsius");
	}

}
