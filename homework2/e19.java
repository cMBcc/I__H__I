package hello;

import java.util.Scanner;

import java.util.Formatter;
public class e19 {
	public static void main(String[] args) {
//		Scanner input =new Scanner(System.in);
		int n=8;
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=n+i-1;j++) {
				if(j<=n-i)System.out.print("    ");
				else System.out.print(String.format("%4d", (int)Math.pow(2, i-Math.abs(j-n)-1)));
			}
			System.out.println();
		}
	}
}
