package ZY10;
import java.util.ArrayList;
import java.util.Date;
public class Account {
	private String name;
	private int id;
	private double balance;
	private ArrayList<Transaction> transactions=new ArrayList<>();
	public Account(String name,int id, double bal) {
		this.name=name;
		this.id=id;
		this.balance=bal;
	}
	public void withDraw(double k) {//»°«Æ
		Date time=new Date();
		Transaction now=new Transaction(time,'W',k,this.balance-k,"»°«Æ");	
		this.balance-=k;
		transactions.add(now);
	}
	
	public void deposit(double k) {//¥Ê«Æ k
		Date time=new Date();
		Transaction now=new Transaction(time,'D',k,this.balance+k,"¥Ê«Æ");	
		this.balance+=k;
		transactions.add(now);
	}
	public void print() {
		for(int i=0;i<transactions.size();i++) {
			transactions.get(i).print();
		}
		System.out.println(name+"now have"+balance+"yuan");
	}
}
