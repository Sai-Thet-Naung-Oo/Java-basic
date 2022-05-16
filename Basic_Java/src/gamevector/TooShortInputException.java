package gamevector;

public class TooShortInputException extends Exception {

	private String error;

	public TooShortInputException()

	{
		// TODO Auto-generated constructor stub
		this.error = "Input is Too Short.";
	}

	public String toString() {
		return this.error;
	}

}
