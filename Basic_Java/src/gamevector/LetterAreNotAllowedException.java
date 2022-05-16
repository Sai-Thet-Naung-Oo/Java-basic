package gamevector;


	
	public class LetterAreNotAllowedException extends Exception {
		
		private String error;
		public LetterAreNotAllowedException() {
			// TODO Auto-generated constructor stub
			this.error="Only Accept Digit.";
		}
		public String toString() {
			return this.error;
		}

	}
	
	


