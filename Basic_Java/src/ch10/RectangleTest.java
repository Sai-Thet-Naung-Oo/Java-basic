package ch10;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.display();
		System.out.println("Rectangle Area:"+r.area()+"\n");
		
		Cube c=new Cube();
		c.display();
		System.out.println("Cube Area:"+c.volume()+"\n");
		
		Cube c1=new Cube(4,5,4);
		c1.display();
		System.out.println("Cube Area:"+c1.volume()+"\n");
	}

}
