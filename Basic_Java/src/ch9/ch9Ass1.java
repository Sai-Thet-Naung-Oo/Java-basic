package ch9;

public class ch9Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1=new Bank();
		System.out.println("\n(a) B1 Information");
		b1.display();
		
		Bank b2=new Bank("Sai Sai","32343",1000);
		System.out.println("\n(b) B2 Information");
		b2.display();
		
		System.out.println();
		b2.increaseBalance(1000);
		System.out.println("\n(c)B2 Information After increasing 1000");
		b2.display();
		
		System.out.println();
		b2.decreaseBalance(500);
		System.out.println("\n(d)B2 Information After decreasing 500");
		b2.display();
		
		
	}

}
