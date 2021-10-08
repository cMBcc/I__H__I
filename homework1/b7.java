package hello;
import java.util.Scanner;
public class b7 {
	public static void main(String[] args) {
		
		long s=System.currentTimeMillis()/1000;
		long m=s/60;
		s=s%60;
		long h=m/60;
		m=m%60;
		h=h%24;
		System.out.println("time is "+h+":"+m+":"+s);
	}

}
