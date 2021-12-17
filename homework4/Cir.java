package ZY4;

public class Cir {
	double r;
	static int numberOfObjects=0;
	Cir(){
		r=1;
		numberOfObjects++;
	}
	Cir(double R){
		r=R;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return r*r*Math.PI;
	}
}
