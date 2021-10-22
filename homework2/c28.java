package hello;

import java.util.Scanner;

public class c28 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double w1=input.nextDouble();
		double h1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double w2=input.nextDouble();
		double h2=input.nextDouble();
		if(x2-w2/2>=x1-w1/2&&x2+w2/2<=w1+w1/2&&y2+h2/2<=y1+h1/2&&y2-h2/2>=y1-h1/2) {
			System.out.println("r2 is inside r1");
		}else {
			System.out.println("r2 does not overlap r1");
		}
	}
}
