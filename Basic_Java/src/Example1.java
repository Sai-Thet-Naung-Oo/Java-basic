package ch8;

import java.util.Scanner;

class Room{
	
	int width,length;

	 Scanner scanner=new Scanner(System.in);
	 
	public int getWidth() {
		return width;
	}

	public void setWidth() {
		this.width = scanner.nextInt();
	}

	public int getLength() {
		return length;
	}

	public void setLength() {
		this.length = scanner.nextInt();
	}
	
	public int area() {
		return this.length*this.width;
	}
	
	public void add(Room r1,Room r2)
	{
		this.length=r1.length+r2.length;
		this.width=r1.width+r2.width;
	}	
	
	
	
	
	
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room r1=new Room();
		Room r2=new Room();
		Room r3=new Room();
		
		System.out.print("Enter Room 1 Width:");
		r1.setWidth();
		
		System.out.print("Enter Room 1 Length:");
		r1.setLength();
		
		System.out.println();
		System.out.println("Room 1 Width:"+r1.getWidth());
		System.out.println("Room 1 Length:"+r1.getLength());
		System.out.println("Room 1 Area:"+r1.area());
		
		System.out.print("\nEnter Room 2 Width:");
		r2.setWidth();
		
		System.out.print("Enter Room 2 Length:");
		r2.setLength();
		
		System.out.println();
		System.out.println("Room 2 Width:"+r2.getWidth());
		System.out.println("Room 2 Length:"+r2.getLength());
		System.out.println("Room 2 Area:"+r2.area());
		
		r3.add(r1, r2);
		System.out.println();
		System.out.println("Room 3 Width:"+r3.getWidth());
		System.out.println("Room 3 Length:"+r3.getLength());
		System.out.println("Room 3 Area:"+r3.area());

	}

}
