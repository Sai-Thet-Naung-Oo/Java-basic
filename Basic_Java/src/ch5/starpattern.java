package ch5;

public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i = 1; i <=5; i++) {
    	
		for (int j = 5; j >i; j--) {
			System.out.print("\t");
		}
		
		for (int k = 1; k <=i; k++) {
			System.out.print("*\t");
			
		}
		System.out.println();
		
	}
	}

}
