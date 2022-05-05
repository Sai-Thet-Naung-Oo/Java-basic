package ch9;

public class Bank {
  String name,number;
  double balance;
  
  public Bank() {
	// TODO Auto-generated constructor stub
	  this.name="John";
	  this.number="12345";
	  this.balance=1000.00;
}
  
  public Bank(String name,String number,double balance) {
	  this.name=name;
	  this.number=number;
	  this.balance=balance;
  }
  
  public void display() {
	  System.out.println("    "
	  		+ "Account Name:"+this.name);
	  System.out.println("    Account Number:"+this.number);
	  System.out.println("    Account Balance:"+this.balance);
	
}
  
  public void increaseBalance(double amount) {
	this.balance+=amount;
	System.out.print("Increased!! current amount:"+this.balance);
}
  
  public void decreaseBalance(double amount) {
		this.balance-=amount;
		System.out.print("Decreased!! current amount:"+this.balance);
	}
}
