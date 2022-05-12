package hello;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class GuessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Guess g=new Guess();

		Random r = new Random();
		Vector v = new Vector();
		Vector v1 = new Vector();
		String s;

		while (v.size() < 4) {
			s = String.valueOf(r.nextInt(9) + 1);
			if (!v.contains(s)) {
				v.add(s);
			}

		}
		System.out.println(v);

		boolean win = false;

		while (!win) {

			v1 = requestUserInput();
			// display(v1);
			if (compareVector(v, v1)) {
				win = true;
			} // check

		}

//		Vector v1 = requestUserInput();
		System.out.println("Yor Win");

	}

	public static Vector requestUserInput() {

		boolean duplicate = false;
		boolean control = false;

		Vector v = new Vector();
		Vector v2 = new Vector();
		String st;

		Scanner scanner = new Scanner(System.in);

		while (!control) {

			System.out.print("\nEnter Number :");
			st = scanner.next();

			for (int i = 0; i < st.length(); i++) {
				v.addElement(String.valueOf(st.charAt(i)));

			}

			for (int i = 0; i < v.size(); i++) {
				if (v2.contains(v.get(i)))
					duplicate = true;
				else
					v2.add(v.get(i));

			}

			if (duplicate) {
				System.out.println("Duplicate!Enter Again");
				duplicate = false;
				v.clear();
				v2.clear();
			}

			else {
				control = true;
				System.out.println("no duplicate");

			}

		}

		return v;
	}

	public static boolean compareVector(Vector v1, Vector v2) {

		int hit = 0, blow = 0;

		if (v1.equals(v2))
			return true;

		for (int i = 0; i < v1.size(); i++) {

			if (v1.get(i).equals(v2.get(i)))
				hit++;

			for (int j = 0; j < v1.size(); j++) {
				if (i != j && v1.get(i).equals(v2.get(j)))
					blow++;

			}

		}

		System.out.println(hit + "H," + blow + "B");

		return false;
	}

}
