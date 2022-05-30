package mingalarpar;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter number for ");
//		ch = scanner.nextLine().charAt(0);

		do {
			new SquaresAndRoots();

			System.out.print("Enter y for exit:");
			ch = scanner.nextLine().charAt(0);
		} while (ch != 'y');

		System.out.println("The end");
	}

}
