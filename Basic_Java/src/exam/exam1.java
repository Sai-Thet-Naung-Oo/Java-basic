package exam;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float amount=50;
		float interest;
		
		for (int i = 1; i <= 12; i++) {
			
	
			interest=amount/100;
			
			amount+=interest;
			System.out.println("After "+i+" Month:"+amount);
			amount+=50;
			
		}
		
		
		

	}

}
