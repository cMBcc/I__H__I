package hello;

public class e27 {
	public static void main(String[] args) {
		for(int i=101;i<=2100;i++) {
			if(i%4==0&&i%100!=0||i%400==0) {
				System.out.println(i);
			}
		}
	}
}
