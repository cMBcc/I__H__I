package ZY5;

import java.util.Random;

public class homework10 {
	public static void main(String[] args) {
		Random t=new Random(5465);
		double a=t.nextDouble()*1000;
		double b=t.nextDouble()*1000;
		double c=t.nextDouble()*1000;
		QE y=new QE(a,b,c);
		System.out.println(y.geta()+"x^2+"+y.getb()+"x+"+y.getc());
		System.out.println("x1="+y.getx1()+" x2="+y.getx2());
	}
}
