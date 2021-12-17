package ZY5;

import java.util.GregorianCalendar;
public class homework5 {
	public static void main(String[] args) {
		GregorianCalendar t=new GregorianCalendar();
		System.out.println(t.get(t.YEAR)+"years"+t.get(t.MONTH)+"months"+t.get(t.DAY_OF_MONTH)+"days");
		t.setTimeInMillis(1234567898765L);
		System.out.println(t.get(t.YEAR)+"years"+t.get(t.MONTH)+"months"+t.get(t.DAY_OF_MONTH)+"days");
	}
}
