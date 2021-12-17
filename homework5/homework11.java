package ZY5;

import java.util.Random;

public class homework11 {
	public static void main(String[] args) {
		Random t=new Random(1000);
		double a=t.nextDouble()*1000;
		double b=t.nextDouble()*1000;
		double c=t.nextDouble()*1000;
		double d=t.nextDouble()*1000;
		double e=t.nextDouble()*1000;
		double f=t.nextDouble()*1000;
		LE z=new LE(a,b,c,d,e,f);
		System.out.println(z.geta()+"x+"+z.getb()+"y="+z.getc());
		System.out.println(z.getd()+"x+"+z.gete()+"y="+z.getf());
		System.out.println("x="+z.getx()+" y="+z.gety());
	}
}
