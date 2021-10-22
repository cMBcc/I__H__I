package hello;

import java.util.Scanner;

public class c22 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double ans=a*a+b*b;
		if(a*a+b*b<=100) {
			System.out.println("Ô²ÄÚ");
		}else {
			System.out.println("Ô²Íâ");
		}
	}
}
