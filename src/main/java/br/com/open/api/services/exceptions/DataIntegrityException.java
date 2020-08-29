package br.com.open.api.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 4768368212862019847L;

	public DataIntegrityException(String msg) {
		super(msg);
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
