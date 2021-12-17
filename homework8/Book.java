package ENDhomework;

public class Book {
	private String name;
	private double price;
	private String press;
	public Book(String name,double price,String press) {
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public String To_String() {
		return "and the name of the book is:"+name+" and the press of the book is:"+press+" and the price of the book is:"+price;
	}
}
