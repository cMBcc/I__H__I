package ZY10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
public class homework16 {
	
	public static void main(String[] args) {
		long a=(int)(Math.random()*10);
		long b=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		ArrayList<Long> se=new ArrayList<>();
		System.out.println("What is "+a+" + "+b+" ?");
		long ans=input.nextInt();
		while(a+b!=ans) {
			boolean flag=true;
			for(int i=0;i<se.size();i++) {
				if(ans==se.get(i)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				se.add(ans);
				System.out.println("Wrong answer. Try again. What is "+a+" + "+b+" ? "+ans);
			}else {
				System.out.println("You already entered"+ans);
			}
			ans=input.nextInt();
		}
		System.out.println("You got it!");
	}
	
}
