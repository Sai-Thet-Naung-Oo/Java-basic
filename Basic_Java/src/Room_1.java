package ch8;

public class Room_1 {
    int width,length;
    
    public Room_1() {
    	this.length=10;
    	this.width=15;
    }
    
    public Room_1(int w,int l) {
    	this.length=l;
    	this.width=w;
    }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void add(Room_1 r2) {
		this.length+=r2.length;
		this.width+=r2.width;
		
	}
	
	public void display() {
		
		System.out.println("Length:"+this.length);
		System.out.println("Width:"+this.width);
		System.out.println("Area:"+this.length*this.width);
	}
}
