package hello;

public class e33 {
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++) {
			if(cla(i)==i)System.out.println(i);
		}
	}
	public static int cla(int x) {
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0)sum+=i;
		}
		return sum;
	}
}
