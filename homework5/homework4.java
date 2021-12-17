package ZY5;

import java.util.Random;

public class homework4 {
	public static void main(String[] args) {
		Random t=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.println(t.nextInt(100));
		}
	}
}
