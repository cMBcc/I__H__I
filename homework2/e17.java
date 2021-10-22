package hello;

import java.util.Scanner;

public class e17 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String s;
		for(int i=1;i<=n;i++) {
			s="";
			for(int j=1;j<=n+i-1;j++) {
				if(j<=n-i)s=s+"  ";
				else s=s+" "+(char)(Math.abs(j-n)+1+'0');
			}
			System.out.println(s);
		}
	}
}
