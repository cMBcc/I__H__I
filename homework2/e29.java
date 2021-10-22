package hello;

import java.util.Scanner;

public class e29 {
	static String [] month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	static String []mm= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	static int []day= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int y=input.nextInt();
		for(int i=1;i<=12;i++)print(y,i);
	}
	public static void print(int y,int k) {
		System.out.println("\t\t"+month[k-1]+" "+y);
		for(int i=1;i<=45;i++)System.out.print("-");
		System.out.println();
		for(int i=0;i<7;i++)System.out.print("   "+mm[i]);
		System.out.println();
		int now=cla(y,k,1);
		now=(now+7-1)%7;
		for(int i=0;i<now;i++)System.out.print("      ");
		int sum=day[k]+(k==2&&(y%4==0&&y%100!=0||y%400==0)?1:0);
		for(int i=1;i<=sum;i++) {
			System.out.print(String.format("   %3d",i));
			now++;
			if(now==7)System.out.println();
			now=now%7;
		}
		if(now!=0)System.out.println();
		System.out.println();
	}
	
	public static int cla(int y,int m,int q) {
		if(m<=2) {
			m+=12;
			y--;
		}
		int j=y/100;
		int k=y%100;
		int ans=(q+(m+1)*26/10+k+k/4+5*j+j/4)%7;
		return ans;
	}
}
