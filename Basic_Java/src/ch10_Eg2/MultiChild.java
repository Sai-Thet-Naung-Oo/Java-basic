package ch10_Eg2;

public class MultiChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square("Square", 5);
		System.out.println("Name="+s.getName());
		System.out.println("Squre Area="+s.getArea());
		
		Circle c=new Circle("Circle",7);
		System.out.println("Name="+c.getName());
		System.out.println("Circle Area="+c.getArea());
	}

}
