package hello;

import java.util.Scanner;

public class homework3_1 {
	public static void main(String[] args) {
		int[] a=new int[110];
		int x;
		Scanner input=new Scanner(System.in);
		for(int i=1;i>0;i++) {
			x=input.nextInt();
			if(x==0)break;
			a[x]+=1;
		}
		for(int i=1;i<=100;i++) {
			if(a[i]!=0)System.out.println(i+" occurs "+a[i]+(a[i]==1?" time":" times"));
		}
	}
}
