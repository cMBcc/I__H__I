package ZY4;

public class a11 {
	public static void main(String[] args) {
		CCCC[] cir;
		cir=creatCircle();
		pirntC(cir);
	}
	public static CCCC[] creatCircle() {
		CCCC[] c=new CCCC[5];
		for(int i=0;i<c.length;i++) {
			c[i]=new CCCC(Math.random()*100);
		}
		return c;
	}
	public static double getsum(CCCC[] c) {
		double ans=0;
		for(int i=0;i<c.length;i++) {
			ans=ans+c[i].getArea();
		}
		return ans;
	}
	public static void pirntC(CCCC[] c) {
		System.out.printf("%-30s%-15s\n","R","Area");
		for(int i=0;i<c.length;i++) {
			System.out.printf("%-30s%-15s\n",c[i].getR(),c[i].getArea());
		}
		System.out.println("_________________________________");
		System.out.println("total areas is "+getsum(c));
	}
	
}
