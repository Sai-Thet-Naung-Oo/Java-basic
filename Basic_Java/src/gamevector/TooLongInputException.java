package gamevector;

public class TooLongInputException extends Exception {
	
	private String error;
	public TooLongInputException() {
		// TODO Auto-generated constructor stub
		this.error="Input is Too Long.";
	}
	public String toString() {
		return this.error;
	}

}
