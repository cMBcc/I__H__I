package hello;
import java.util.Scanner;
	public class b8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		double pur=input.nextDouble();
		double tax=pur*0.06;
		System.out.println("Salse tax is $"+(int)(tax *100)/100.0);
		
	}

}
