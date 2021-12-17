package ZY5;
import java.util.Date;
public class StopWatch {
	private Date time=new Date();
	private long endtime=0;
	private long statime=0;
	public StopWatch() {
		endtime=0;
		statime=0;
	}
	public void start() {
		this.statime=time.getTime();
	}
	public void stop() {
		this.endtime=time.getTime();
	}
	public long getElapsedTime() {
		System.out.println(endtime-statime);
		return this.endtime-this.statime;
	}
	public long getsta() {
		return this.statime;
	}
	public long getend() {
		return this.endtime;
	}
	
}
