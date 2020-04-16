package edu.sinclair;

@SuppressWarnings("serial")
public class LinkedInException extends Exception {

	LinkedInException() {
		super();
	}

	LinkedInException(String message) {
		super(message);

	}

	LinkedInException(String message, Throwable cause) {
		super(message, cause);

	}

	protected LinkedInException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	LinkedInException(Throwable cause) {
		super(cause);

	}

}
