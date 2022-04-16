package com.practice.userservice.exception;


import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchUserException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public NoSuchUserException() {
		super();
	}
	
	public NoSuchUserException(String message) {
		super(message);
	}
}

