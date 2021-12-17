package ZY4;

public class TV{
	int c=1;
	int v=1;
	boolean on=false;
	public TV() {
		
	}
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	}
	public void setc(int C) {
		if(on&&C>=1&&C<=120)c=C;
	}
	public void setv(int V) {
		if(on&&V>=1&&V<=7) v=V;
	}
	public void cup() {
		if(on&&c<120)c++;
	}
	public void cdown() {
		if(on&&c>1)c--;
	}
	public void vup() {
		if(on&&v<7)v++;
	}
	public void vdown() {
		if(on&&v>1)v--;
	}
}
