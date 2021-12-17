package ZY4;

public class a2 {
	public static void main(String[] args) {
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setc(30);
		tv1.setv(3);
		
		TV tv2=new TV();
		tv2.turnOn();
		tv2.cup();
		tv2.cup();
		tv2.vup();
		System.out.println("tv1 c is "+tv1.c+" tv1 v is "+tv1.v);
		System.out.println("tv2 c is "+tv2.c+" tv2 v is "+tv2.v);
	}
}

