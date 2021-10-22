package hello;

import java.util.Scanner;

public class c17 {
	public static void main(String[] args) {
		String [] m= {"scissor","rock","paper"};
		int a =(int)(Math.random()*3);
		Scanner input =new Scanner(System.in);
		int b=input.nextInt();
		System.out.println("computer is"+m[a]);
		if(b==a) {
			System.out.println("you ping");
		}else if((a-b+3)%3==1) {
			System.out.println("you win");
		}else {
			System.out.println("you draw");
		}
	}
//	
	
}
