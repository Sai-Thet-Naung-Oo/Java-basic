package gamevector;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Guess {
	int hit, blow;
	Vector v1, v2;

	public Guess() {
		// TODO Auto-generated constructor stub
		this.hit = 0;
		this.blow = 0;
		this.v1 = new Vector();
		this.v2 = new Vector();

	}

	public void start() {

		Random r = new Random();
		String s;
		while (this.v1.size() < 4) {
			s = String.valueOf(r.nextInt(9) + 1);
			if (!this.v1.contains(s)) {
				this.v1.addElement(s);
			}

		}

	}

	public void requestUserInput() throws TooLongInputException, TooShortInputException, SpaceNotAllowedException,
			LetterAreNotAllowedException, DuplicateAreNotAllowedException {

		Vector v = new Vector();
		Vector vcheck = new Vector();
		String st;
		String[] st1 = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Collections.addAll(vcheck, st1);

		Scanner scanner = new Scanner(System.in);

		boolean inputError = true;

		while (inputError) {

			try {
				st = "";
				v.clear();
				this.v2.clear();
				System.out.print("Enter Number:");
				st = scanner.nextLine();

				if (st.length() < 4) {
					inputError = true;
					throw new TooShortInputException();
				}
				if (st.length() > 4) {
					inputError = true;
					throw new TooLongInputException();
				}

				for (int i = 0; i < st.length(); i++) {
					this.v2.addElement(String.valueOf(st.charAt(i))); // seperate string to vector

				}
				if (this.v2.contains(" ")) {
					inputError = true;
					throw new SpaceNotAllowedException();
				}

				for (int i = 0; i < this.v2.size(); i++) {
					if (!vcheck.contains(this.v2.get(i))) {
						inputError = true;
						throw new LetterAreNotAllowedException();
					}
				}

				for (int i = 0; i < this.v2.size(); i++) { // test duplicate
					if (v.contains(this.v2.get(i))) {
						inputError = true;
						throw new DuplicateAreNotAllowedException();
					} else
						v.add(this.v2.get(i));

				}

				inputError = false;

			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e + "Enter only 4 digit.(1 to 9)");
			}

		}
	}

	public boolean compareVector(Vector v2) {

		this.hit = 0;
		this.blow = 0;

		if (this.v1.equals(v2))
			return true;

		for (int i = 0; i < this.v1.size(); i++) {

			if (this.v1.get(i).equals(v2.get(i)))
				this.hit++;

			for (int j = 0; j < this.v1.size(); j++) {
				if (i != j && this.v1.get(i).equals(v2.get(j)))
					this.blow++;

			}

		}

		System.out.println("Result :" + hit + "H," + blow + "B");

		return false;
	}

	public void display(Vector v) {
		System.out.println("Random number:" + v);
	}

	public void showResult(boolean win) {

		if (win)
			System.out.println("!!!!!!!! YOU WIN !!!!!!!!!!!!!");
		else
			System.out.println("you lose");

	}

	public boolean playAgain() {
		boolean exit;
		char num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you want to play again(y/n):");

		do {
			num = Character.toLowerCase(scanner.next().charAt(0));
			if (num == 'y' || num == 'n') {
				exit = (num == 'y') ? true: false;
				break;
			} else
				System.out.print("Enter Only One Character(y/n):");
		} while (true);
		return exit;
	}

}
