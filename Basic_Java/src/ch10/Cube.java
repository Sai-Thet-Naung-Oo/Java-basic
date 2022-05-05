package ch10;

public class Cube extends Rectangle{
	private int length;
	
	public Cube() {
		// TODO Auto-generated constructor stub
		super();
		this.length=9;
	}
	
	public Cube(int width,int lenght,int height) {
		super(width,height);
		this.length=lenght;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int volume() {
		// TODO Auto-generated method stub
		return super.area()*this.length;
	}
	
	public void display() {
		super.display();
		System.out.println("Length:"+this.length);
	}
	

}
