package ZY5;
import java.util.Date;

class homework3 {
	public static void main(String[] args) {
		Date t=new Date();
		long time=1000;
		
		for(int i=1;i<=8;i++) {
			time=time*10;
			t.setTime(time);
			System.out.println(t.toString());
		}
	}
}
