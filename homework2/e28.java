package hello;

import java.util.Scanner;

public class e28 {	
	static String []M= {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
	static String [] month= {"January","February","March","April","May","June","July","August","September","October","November","December"};
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int y=input.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(month[i-1]+" 1 "+y+" is "+cla(y,i,1));
		}
		
	}
	public static String cla(int y,int m,int q) {
		if(m<=2) {
			m+=12;
			y--;
		}
		int j=y/100;
		int k=y%100;
		int ans=(q+(m+1)*26/10+k+k/4+5*j+j/4)%7;
		return M[ans];
	}	
	
	
}
