package hello;

import java.util.Scanner;

public class GuessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;

		Scanner scanner = new Scanner(System.in);

		boolean exit = false;
		boolean win;

		while (!exit) {
			win = false;
			count = 1;
			Guess g = new Guess();
			g.start();
			g.display(g.v1);

			while (!win && count <= 5) {

				System.out.println("\n" + count + " time");

				if (g.play())
					win = true;
				else
					count++;

			}

			if (win)
				System.out.println("!!!!!!!! YOU WIN !!!!!!!!!!!!!");
			else
				System.out.println("you lose");

			System.out.println("Enter 0 for Exit (or) 1 for try again:");

			int num = scanner.nextInt();

			exit = (num == 0) ? true : false;

		}

		System.out.println("Thank for Playing Guess Game!!!Bye");

	}

}
