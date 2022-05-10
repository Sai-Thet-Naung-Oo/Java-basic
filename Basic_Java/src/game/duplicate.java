package game;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		int[] arr1 = new int[4];
		int num;
		int k = 0;
		boolean win = false;

		while (k < 4) {

			num = (int) (Math.random() * 10);

			if (!duplicatetest(arr, num)) {
				arr[k] = num;
				k++;
			}

		}
		System.out.print("Guess Game  ");
		display(arr);

		while (!win) {

			arr1 = requestUserInput();
			display(arr1);
			if (compareArray(arr, arr1)) {
				win = true;
			} // check

		}

//System.out.println(Math.random());

		System.out.println("the end");

	}

	public static boolean compareArray(int[] arr, int[] arr1) {
		int hit = 0, blow = 0;
		for (int i = 0; i < arr.length; i++) {
			// hit=0;blow=0;
			if (arr[i] == arr1[i]) {
				hit++;
				if (hit == 4)
					return true;
			}

			for (int j = 0; j < arr1.length; j++) {
				if (i != j && arr[i] == arr1[j])
					blow++;

			}

		}

		System.out.println(hit + "H," + blow + "B");

		return false;
	}

	public static int[] requestUserInput() {

		int[] arr1 = new int[4];
		int j = 0;
		int num;
		boolean duplicate = false;

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter Number :");
		num = scanner.nextInt();

		do {

			for (int i = 0; i < j; i++) { // Test duplicate

				if (num == arr1[i]) {
					duplicate = true;
					break;
				}

			}

			if (duplicate) { // Equal Duplicate
				System.out.print("Duplicate!!Enter Another Number :"); // request user input again
				num = scanner.nextInt();
				duplicate = false;

			} else { // Not Duplicate
				arr1[j] = num; // insert number to array
				j++; // array increment
				if (j < 4) {
					System.out.print("Enter Number :"); // request user input
					num = scanner.nextInt();
				}

			}

		} while (j < 4);

		return arr1;

	}

	public static boolean duplicatetest(int[] array, int num) {

		int j = 0;
		boolean duplicate = false;

		for (int i = 0; i < array.length; i++) { // Test duplicate

			if (num == array[i]) {
				duplicate = true;
				break;
			}

		}

		if (duplicate) { // Equal Duplicate

			duplicate = false;
			return true;

		} else { // Not Duplicate

			return false;
		}

	}

	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
	}
}
