package exam;

public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 20; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				if(i%j==0 && i/j==1) {
					
					System.out.println(i);
					
				}
				
			}
			
		}
	}

}
