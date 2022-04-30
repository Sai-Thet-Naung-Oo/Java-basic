package ch6;

import java.util.Scanner;

public class duplicatetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5];
		int num;
		int j = 0;

		boolean duplicate = false;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number :");
		num = scanner.nextInt();

		do {                                         

			
			for (int i = 0; i < array.length; i++) {  //Test duplicate

				if (num == array[i]) {
					duplicate = true;
					break;
				}

			}  
			
			
			

			if (duplicate) {                                            //Equal Duplicate
				System.out.print("Duplicate!!Enter Another Number :");  //request user input again
				num = scanner.nextInt();
				duplicate = false;

			} else {                                 //Not Duplicate
				array[j] = num;						 //insert number to array
				j++;								 //array increment
				if(j<5) {
					System.out.print("Enter Number :");  //request user input
					num = scanner.nextInt();
				}
				
			}

			
			
			
		} while (j < 5);
		
		
		
		

		for (int i = 0; i < array.length; i++) {     //Output Result
			System.out.print(array[i] + " ");

		}

	}

}
