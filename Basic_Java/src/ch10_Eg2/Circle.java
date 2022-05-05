package ch10_Eg2;

public class Circle extends Shape {
   
	 int radius;
	 public Circle(String n,int r) {
		// TODO Auto-generated constructor stub
		 super(n);
		 this.radius=r;
	}
	 
	public double getArea() {
		return 3.14159*this.radius*this.radius;
	}
	 
	 
}
