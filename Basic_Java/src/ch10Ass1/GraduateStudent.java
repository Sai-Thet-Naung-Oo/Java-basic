package ch10Ass1;

public class GraduateStudent extends Student{
	char credit;

	public GraduateStudent() {
		super();
		this.credit='\u0000';
		// TODO Auto-generated constructor stub
	}

	public GraduateStudent(int studentNo, String name,char credit) {
		super(studentNo, name);
		// TODO Auto-generated constructor stub
		this.credit=credit;
	}
	public void Display() {
		super.Display();
		System.out.println("Credit:"+this.credit);
		
	}

}
