package ch10_Eg1;

public class testInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(4, 5);
		System.out.println("Rectangle Area="+r.calculateArea());
		
		Box b=new Box(6, 17, 8);
		System.out.println("Box Volume="+b.getVolume());
	}

}
