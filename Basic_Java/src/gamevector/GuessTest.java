package gamevector;

public class GuessTest {

	public static void main(String[] args) throws TooLongInputException, TooShortInputException,
			SpaceNotAllowedException, LetterAreNotAllowedException, DuplicateAreNotAllowedException {
		
		int count;
		boolean win;

		while (true) {
			win = false;
			count = 1;

			Guess g = new Guess();
			g.start();
			g.display(g.v1);

			while (!win && count <= 5) {
				System.out.println("\n" + count + " time");
				g.requestUserInput();
				
				if (g.compareVector(g.v2))
					win = true;
				else
					count++;
			}

			g.showResult(win);

			if (!g.playAgain())
				break;

			System.out.println();
		}

		System.out.println("Thank for Playing Guess Game!!!Bye");

	}

}
