package com.car.exceptionss;

public class UserNameBlankException extends RuntimeException {
	
	
	String message;
	public UserNameBlankException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
