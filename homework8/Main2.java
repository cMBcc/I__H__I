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
import java.util.TreeSet;
public class Main2 {
	static Set<Student>se=new TreeSet<Student>();
	public static void main(String[] args)throws java.io.IOException {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String id,name;
		int age;
		for(int i=0;i<n;i++) {
			System.out.println("请输入你的学号:");
			id=input.next();
			System.out.println("请输入你的姓名:");
			name=input.next();
			System.out.println("请输入你的年龄:");
			age=input.nextInt();
			se.add(new Student(id,name,age));
		}
		for(Student key:se) {
			System.out.println(key.To_String());
		}
		write();
	}
	public static void write()throws java.io.IOException {
		java.io.File file=new java.io.File("学生信息.txt");
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		output.println(se.size());
		for(Student key:se) {
			output.println(key.To_String());
		}
		output.close();
	}
}
