package hello;

import java.util.Scanner;

public class e36 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String a=input.next();
		int ans=0;
		for(int i=0;i<a.length();i++) {
			ans=ans+(a.charAt(i)-'0')*(i+1);
		}
		a=a+(char)(ans%11+'0');
		System.out.println(a);
	}
}
