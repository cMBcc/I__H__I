package hello;

import java.util.Scanner;

public class homework3_3 {
	public static void main(String[] args) {
		int n,m;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int list1[]=new int[n];
		for(int i=0;i<n;i++)list1[i]=input.nextInt();
		m=input.nextInt();
		int list2[]=new int[m];
		for(int i=0;i<m;i++)list2[i]=input.nextInt();
		int list[]=merge(list1,list2);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	public static int[] merge(int[] list1,int[] list2) {
		int len1=list1.length,len2=list2.length;
		int list[]=new int[len1+len2];
		int cnt=0;
		for(int p=0,q=0;p<len1||q<len2;) {
			if(p==len1) {
				list[cnt++]=list2[q++];
			}else if(q==len2) {
				list[cnt++]=list1[p++];
			}else if(list1[p]>list2[q]) {
				list[cnt++]=list2[q++];
			}else {
				list[cnt++]=list1[p++];
			}
		}
		
		return list;
	}
}
