package hello;

import java.util.Scanner;

public class e7 {
	public static void main(String[] args) {
		double a=1000;
		double ans=0;
		double b=0;
		for(int i=1;i<=13;i++) {
			a=a*1.05;
			if(i==10)b=a;
			if(i>=10)ans+=a;
		}
		System.out.println("十年后学费:"+b+" 四年内学费:"+ans);
	}
}
