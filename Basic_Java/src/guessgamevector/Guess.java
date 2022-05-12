package hello;

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

	public boolean play() {

		requestUserInput();
		// display(v1);
		if (compareVector(this.v1, this.v2))
			return true;
		else
			return false;
	}

	public void requestUserInput() {

		boolean duplicate = false;
		boolean control = false;

		Vector v = new Vector();
		Vector v2 = new Vector();
		String st="";

		Scanner scanner = new Scanner(System.in);

		while (!control) {

			while(st.length()!=4) {
				System.out.print("Enter Number :");
				st = scanner.next();
			}
			

			for (int i = 0; i < st.length(); i++) {
				v.addElement(String.valueOf(st.charAt(i))); // seperate string to vector

			}

			for (int i = 0; i < v.size(); i++) { // test duplicate
				if (v2.contains(v.get(i)))
					duplicate = true;
				else
					v2.add(v.get(i));

			}

			if (duplicate) { // show duplicate
				System.out.println("Duplicate!Enter Again");
				duplicate = false;
				v.clear();
				v2.clear();
			}

			else
				control = true;
			
			st="";

		}

		this.v2 = v;
	}

	public boolean compareVector(Vector v1, Vector v2) {

		this.hit = 0;
		this.blow = 0;

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

		System.out.println("Result :" + hit + "H," + blow + "B");

		return false;
	}

	public void display(Vector v) {
		System.out.println(v);
	}

}
