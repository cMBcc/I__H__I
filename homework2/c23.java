package hello;

import java.util.Scanner;

public class c23 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		if(a>=-5&&a<=5&&b>=-2.5&&b<=2.5) {
			System.out.println("矩形内");
		}else{
			System.out.println("矩形外");
		}
		
	}
}
