package ENDhomework;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int age;
	public Student(String id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int compareTo(Student r) {
		int flag=0;
		if(age>r.getAge())flag = 1;
		else if(age==r.getAge())flag = 0;
		else if(age<r.getAge())flag = -1;
		return flag;
	}
	public String To_String() {
		return "The name of the student is "+name+" and his/her age is "+age+" and his/her student id is "+id;
	}
}
