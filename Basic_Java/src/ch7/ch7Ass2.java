package ch7;

import java.util.Arrays;
import java.util.Scanner;

public class ch7Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, avg, num;
		int[] arr = { 70, 35, 100, 40, 80, 90, 50, 70, 45, 28 };
		System.out.print("Before Sorting Array:");
		Display(arr); // before sort
		System.out.println();
		System.out.print("(a) Sorted Array:");
		Arrays.sort(arr);
		Display(arr); //

		sum = Sum(arr);

		System.out.println("\n(b) Sum :" + sum);
		Average(sum, arr.length);

		Search(arr);

	}

	public static void Display(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}

	}

	public static int Sum(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];

		}
		return sum;
	}

	public static void Average(int sum, int count) {
		System.out.println("(c) Average :" + sum / count);
	}

	public static void Search(int[] arr) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("(d) Search Number in Array :");
		num = scanner.nextInt();

		if (Arrays.binarySearch(arr, num) > 0)
			System.out.println("found at : " + Arrays.binarySearch(arr, num));
		else
			System.out.println("not found");
	}

}
