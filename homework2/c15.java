package hello;

import java.util.Scanner;

public class c15 {
	public static void main(String[] args) {
		String a ="";
		a=a+(char)((Math.random()*10)+'0')+(char)((Math.random()*10)+'0')+(char)((Math.random()*10)+'0');
		Scanner input =new Scanner(System.in);
		String b=input.next();
		int flag1=1;
		if(a!=b)flag1=0;
		int flag2=1;
		int [] vis= {0,0,0};
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(vis[j]==1)continue;
				if(a.charAt(i)==b.charAt(j)) {
					vis[j]=1;
					break;
				}
			}
		}
		int flag3=0;
		for(int i=0;i<3;i++) {
			if(vis[i]==0)flag2=0;
			if(vis[i]==1)flag3=1;
		}
		int ans=0;
		if(flag1==1)ans=10000;
		else if(flag2==1)ans=3000;
		else if(flag3==1)ans=1000;
		System.out.println(a);
		System.out.println(ans);
	}
}
