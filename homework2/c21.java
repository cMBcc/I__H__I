package hello;

import java.util.Scanner;

public class c21 {
	public static void main(String[] args) {
		String []M= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		Scanner input =new Scanner(System.in);
		int y=input.nextInt();
		int m=input.nextInt();
		int q=input.nextInt();
		if(m<=2) {
			m+=12;
			y--;
		}
		int j=y/100;
		int k=y%100;
		int ans=(q+(m+1)*26/10+k+k/4+5*j+j/4)%7;
		System.out.println(M[ans]);
	}
}
