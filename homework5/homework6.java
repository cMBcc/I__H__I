package ZY5;
import java.util.Random;
public class homework6 {
	public static void main(String[] args) {
		int a[]=new int[100000];
		int n=100000;
		Random t=new Random(1000);
		for(int i=0;i<n;i++) {
			a[i]=t.nextInt(1000000);
		}
		StopWatch time=new StopWatch();
		time.start();
		System.out.println(time.getsta());
		for(int i=0;i<n;i++) {
			int k=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[k])k=j;
			}
			int temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			//System.out.println(a[i]);
		}
		
		time.stop();
		System.out.println(time.getend());
		System.out.println(time.getElapsedTime());
	}

}
