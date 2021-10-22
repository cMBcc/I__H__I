package hello;

public class e32 {
	public static void main(String[] args) {
		int fir=(int)(Math.random()*10);
		int sec=(int)(Math.random()*10);
		while(fir==sec) {
			sec=(int)(Math.random()*10);
		}
		System.out.println(fir);
		System.out.println(sec);
	}
}
