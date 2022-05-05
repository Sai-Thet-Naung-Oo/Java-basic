package ch8;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room_1 r1=new Room_1(4,5);
		Room_1 r2=new Room_1();
		
		System.out.println("Room 1 Before adding");
		r1.display();
		
		r1.add(r2);
		
		System.out.println();
		System.out.println("Room 2");
		r2.display();
		
		System.out.println();
		System.out.println("Room 1+2 After adding");
		r1.display();
		
	}

}
