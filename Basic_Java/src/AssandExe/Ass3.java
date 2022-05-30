package mingalarpar;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int result = 1;

		while (i <= 9) {
			if (i == 1)
				System.out.print(result + " ");

			System.out.print((result *= 2) + " ");
			i++;
		}

	}

}
