package ch8;

public class Student {
    String name,address;
    int mark;
    
    public Student(String name,String address,int mark) {
		// TODO Auto-generated constructor stub
    	this.name=name;
    	this.address=address;
    	this.mark=mark;
	}
    
    public void display() {
    	System.out.println("Student Name:"+this.name);
    	System.out.println("Student Address:"+this.address);
    	System.out.println("Student Mark:"+this.mark);
		
	}
}
