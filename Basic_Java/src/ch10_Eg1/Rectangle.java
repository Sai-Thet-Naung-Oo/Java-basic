package ch10_Eg1;

public class Rectangle {
	
	int width,length;
	public Rectangle(int w,int l) {
		// TODO Auto-generated constructor stub
		this.width=w;
		this.length=l;
	}
	
	public int calculateArea() {
		return this.width*this.length;
	}

}
