package exam;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e1yearlySalary,e2yearlySalary;
		
		Employee e1=new Employee("Sai Thet", "Naung OO", -9);
		Employee e2=new Employee("U BA", "OO", 200);
		
		e1yearlySalary=e1.getMonthly_salary()*12;
		e2yearlySalary=e2.getMonthly_salary()*12;
		
		System.out.println("Empployee 1 Name:"+e1.getFirst_name()+" "+e1.getLast_name());
		System.out.println("Yearly Salary:"+e1yearlySalary);
		
		System.out.println();
		System.out.println("Empployee 2 Name:"+e2.getFirst_name()+" "+e2.getLast_name());
		System.out.println("Yearly Salary:"+e2yearlySalary);
		
		System.out.println("\nAfter 10% raise");
		
		System.out.println("Empployee 1 Name:"+e1.getFirst_name()+" "+e1.getLast_name());
		System.out.println("Yearly Salary:"+(e1yearlySalary+(e1yearlySalary*0.1)));
		
		System.out.println();
		System.out.println("Empployee 2 Name:"+e2.getFirst_name()+" "+e2.getLast_name());
		System.out.println("Yearly Salary:"+(e2yearlySalary+(e2yearlySalary*0.1)));

	}

}
