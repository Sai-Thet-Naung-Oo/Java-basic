package ch9;

public class ch9Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Time t1=new Time();
		Time t2=new Time(5, 80, 80);
		Time t3=new Time();
		t3.add(t1, t2);
		t3.display();
		}

}
