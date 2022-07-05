package com.flght.exception;

public class FlightException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public FlightException() {}
	public FlightException(String msg) {
		super(msg);
		this.message=msg;
	}
	
}
