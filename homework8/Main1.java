package ENDhomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
	static Map<String,Book>mp=new HashMap<String,Book>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s,name,press;
		double price;
		for(int i=0;i<n;i++) {
			System.out.println("�������鼮���:");
			s=input.next();
			System.out.println("�������鼮����:");
			name=input.next();
			System.out.println("�������鼮������:");
			press=input.next();
			System.out.println("�������鼮�۸�:");
			price=input.nextDouble();
			mp.put(s, new Book(name,price,press));
		}
		for(String key:mp.keySet()) {
			System.out.println("The id of the book is "+key+" "+mp.get(key).To_String());
		}
	}
}
