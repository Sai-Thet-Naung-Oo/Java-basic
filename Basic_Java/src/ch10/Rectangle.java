package ch10;

public class Rectangle {

	private int width,height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.width=3;
		this.height=9;
	}
	
   public Rectangle(int width,int height) {
	   this.width=width;
	   this.height=height;
   }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return this.height*this.width;
		
	}
	public void display() {
		System.out.println("Width:"+this.width);
		System.out.println("Height:"+this.height);
		
		
	}
}
