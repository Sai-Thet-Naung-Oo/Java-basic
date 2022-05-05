package ch10;

public class Employee extends Person {
	private double salary;
	
	public Employee(String n,String add,double salary) {
		// TODO Auto-generated constructor stub
		super(n,add);
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name:"+super.getName());
		System.out.println("Address:"+super.getAddress());
		System.out.println("Salary:"+getSalary());
	}
	
}
