package hello;
import java.util.Scanner;
public class b5 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a seconds: ");
		int s=input.nextInt();
		int m=s/60; 
		int ss=s%60;
		System.out.println(s+"second is "+m+" minutes "+ss+" seconds");
	}

}
