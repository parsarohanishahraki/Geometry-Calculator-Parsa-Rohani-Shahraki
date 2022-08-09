package exception;

public class InvalidInputException extends Exception {
	
	/**
	 * Constructor that will push the error message.
	 */
	public InvalidInputException() {
		super("Enter a number or decimal number.");
	}

	public InvalidInputException(String message) {
		super(message);
	}

	public InvalidInputException(Throwable cause) {
		super(cause);
	}

	public InvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
