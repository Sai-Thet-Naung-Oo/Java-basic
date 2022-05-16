package gamevector;



	
	public class SpaceNotAllowedException extends Exception {

		private String error;

		public SpaceNotAllowedException()

		{
			// TODO Auto-generated constructor stub
			this.error = "Space Are Not Allowed.";
		}

		public String toString() {
			return this.error;
		}

	}
	
	

