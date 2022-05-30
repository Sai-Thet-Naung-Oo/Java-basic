package mingalarpar;

import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number :");
		num = scanner.nextInt();

		do {
			System.out.println(num * num);

			System.out.print("Enter Number :");
			num = scanner.nextInt();

		} while (num != 0);

		System.out.println("The end");

	}

}
