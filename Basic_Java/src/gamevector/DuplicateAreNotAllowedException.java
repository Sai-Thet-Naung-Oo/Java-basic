package gamevector;

public class DuplicateAreNotAllowedException extends Exception {

	private String error;

	public DuplicateAreNotAllowedException()

	{
		// TODO Auto-generated constructor stub
		this.error = "Duplicate Digit Are Not Allowed.";
	}

	public String toString() {
		return this.error;
	}

}
