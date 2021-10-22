package hello;

import java.util.Scanner;

public class homework3_2 {
	public static void main(String[] args) {
		int[] vis=new int[2000];
		Scanner input=new Scanner(System.in);
		int cnt=0;
		for(int i=0;i<10;i++) {
			int x=input.nextInt();
			if(vis[x]==0) {
				System.out.print(x+" ");
				vis[x]=1;
				cnt++;
			}
		}
		System.out.println();
		System.out.println(cnt);
	}
}
