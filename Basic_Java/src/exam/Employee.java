package exam;

public class Employee {
  String first_name,last_name;
  double monthly_salary;
  
  public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getMonthly_salary() {
		return monthly_salary;
	}
	public void setMonthly_salary(double monthly_salary) {
		
		if(monthly_salary<0)
			this.monthly_salary=0;
		else
		    this.monthly_salary = monthly_salary;
	}
	
  public Employee(String first,String last,double salary) {
	  this.first_name=first;
	  this.last_name=last;
	  setMonthly_salary(salary);;
  }
  
  
  
  
}
