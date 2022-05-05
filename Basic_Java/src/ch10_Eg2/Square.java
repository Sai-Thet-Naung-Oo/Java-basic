package ch10_Eg2;

public class Square extends Shape {
   int side;
   public Square(String n,int s) {
	// TODO Auto-generated constructor stub
	   super(n);
	   this.side=s;
}
   public int getArea() {
	return this.side*this.side;
}
}
