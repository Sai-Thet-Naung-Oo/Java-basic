package ch10_fromTecher;

import java.util.Scanner;

public class Employee {
	double rateOfPay;
	int numberOfDay;

	public Employee() {
		this.rateOfPay = 250;
	}
	
	Scanner scanner=new Scanner(System.in);
	
	
	
	public void getNumDays() {
		System.out.print("Enter Number of Days Worked:");
		this.numberOfDay=scanner.nextInt();
	}
	
	public double calculateWeeklyPay() {
		return this.rateOfPay*this.numberOfDay;
	}
	
	public void displayWeeklyPay() {
		System.out.println("Weekly Pay:"+calculateWeeklyPay());
	}

}
