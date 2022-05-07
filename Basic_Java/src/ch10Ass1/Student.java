package ch10Ass1;

public class Student {
	int StudentNo;
	String Name;

	public Student() {

		this.StudentNo = 0;
		this.Name = "Mg Mg";
	}


	public Student(int studentNo, String name) {
		this.StudentNo = studentNo;
		this.Name = name;
	}

	public void Display() {
		System.out.println("Studend Number" + this.StudentNo);
		System.out.println("Studend Name" + this.Name);

	}

}
