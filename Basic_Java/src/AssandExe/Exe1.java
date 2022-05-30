package mingalarpar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] sale = new double[7];
		String[] day = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
		double max = 0;
		int maxday = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < sale.length; i++) {
			System.out.print("Enter Sale for " + day[i] + " :");
			sale[i] = scanner.nextInt();

		}

		for (int i = 0; i < sale.length; i++) {
			if (sale[i] > max) {
				max = sale[i];
				maxday = i;
			}

		}

		System.out.println("Largest sale day is " + day[maxday]);

	}

}
