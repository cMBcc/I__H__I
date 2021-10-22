package hello;

import java.util.Scanner;

public class e38 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		String ans="";
		while(a>0) {
			ans=(char)(a%8+'0')+ans;
			a/=8;
		}
		System.out.println(ans);
	}
}
