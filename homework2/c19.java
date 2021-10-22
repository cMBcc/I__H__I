package hello;

import java.util.Scanner;

public class c19 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b<c||a+c<b||b+c<a) {
			System.out.println("²»ºÏ·¨");
		}else {
			System.out.println(a+b+c);
		}
		
	}
}
