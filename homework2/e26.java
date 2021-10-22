package hello;

public class e26 {
	public static void main(String[] args) {
		double ans=1;
		double b=1.0;
		for(int i=1;i<=100000;i++) {
			b=b/(double)i;
			ans=ans+b;
			if(i%10000==0)System.out.println(ans);
		}
	}
}
