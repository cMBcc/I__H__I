package hello;

public class e25 {
	public static void main(String[] args) {
		double ans=0;
		double b=1.0;
		int flag=1;
		for(int i=1;i<=100000;i++) {
			ans=ans+flag*1.0/(i*2-1);
			flag=-flag;
			if(i%10000==0)System.out.println(ans*4.0);
		}
	}
}
