package ch10;

public class Student extends Person {
	private int mark;
	public Student(String n,String add,int mark) {
		// TODO Auto-generated constructor stub
		super(n, add);
		this.mark=mark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	public void display() {
		System.out.println("Name:"+super.getName());
		System.out.println("Address:"+super.getAddress());
		System.out.println("Marks:"+getMark());
	}

}
