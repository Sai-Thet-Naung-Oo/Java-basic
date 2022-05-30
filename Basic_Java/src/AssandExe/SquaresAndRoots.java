package mingalarpar;

import java.util.Scanner;

public class SquaresAndRoots {
	
	
	float num;
	public SquaresAndRoots() {
		// TODO Auto-generated constructor stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number for Square and Roots: ");
		num = scanner.nextInt();
		System.out.println("Square:"+Math.pow(num, 2));
		System.out.println("Root:"+Math.sqrt(num));
		
	}
}
