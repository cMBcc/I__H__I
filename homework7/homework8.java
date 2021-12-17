package ZY10;

public class homework8 {
	public static void main(String[] args) {
		Account a =new Account("George",1122,1000);
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);
		a.withDraw(5);
		a.withDraw(4);
		a.withDraw(2);
		a.print();
	}
}
