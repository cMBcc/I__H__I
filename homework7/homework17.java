package ZY10;

import java.util.Scanner;

public class homework17 {
	public static void main(String[] args) {
		int []a=new int[100];
		int []num=new int[100];
		int cnt=0;
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int temp=m;
		for(int i=2;i*i<=m;i++) {
			if(m%i==0) {
				a[++cnt]=i;
				while(m%i==0) {
					num[cnt]++;
					m=m/i;
				}
			}
		}
		if(m!=1) {
			a[++cnt]=m;
			num[cnt]=1;
		}
		int n=1;
		for(int i=1;i<=cnt;i++) {
			if(num[i]%2==1)n=n*a[i];
		}
		m=temp;
		System.out.println("n is "+n+" and n*m is "+n*m);
	}
}
