package hello;

import java.util.Scanner;

public class c24 {
	public static void main(String[] args) {
		String []s1= {"Clubs","Diamonds","Hearts","Spades"};
		String []s2= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int a=(int)(Math.random()*54+1);
		int b=(a+12)/13;
		int c=(a-1)%13+1;
		System.out.println("the card you pick is "+s2[c-1]+" of "+s1[b-1]);
	}
}
