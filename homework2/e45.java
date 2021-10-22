package hello;
import java.util.Scanner;
public class e45 {
	public static void main(String[] args) {
		double a;
		Scanner input =new Scanner(System.in);
		double ans=0;
		double ans2=0;
		for(int i=0;i<10;i++) {
			a=input.nextDouble();
			ans+=a;
			ans2+=a*a;
		}
		ans2=Math.sqrt((ans2-ans*ans/10.0)/9.0);
		ans=ans/10.0;
		System.out.println(ans);
		System.out.println(ans2);
	}
}
