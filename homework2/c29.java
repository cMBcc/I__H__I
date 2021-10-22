package hello;

import java.util.Scanner;

public class c29 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		double temp=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		if(temp<=Math.abs(r1-r2)) {
			System.out.println("c2 is inside c1");
		}else if(temp<=r1+r2){
			System.out.println("c2 overlaps c1");
		}else {
			System.out.println("c2 does not overlap c1");
		}
	}
}
