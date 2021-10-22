package hello;

import java.util.Scanner;

public class c27 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		
		if(a>=0&&b>=0&&a+2*b-200<=0) {
			System.out.println("三角形内");
		}else {
			System.out.println("三角形外");
		}
	}
}
