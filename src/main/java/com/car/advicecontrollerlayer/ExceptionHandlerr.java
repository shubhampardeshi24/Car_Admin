package com.car.advicecontrollerlayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.car.exceptionss.UserNameBlankException;

@ControllerAdvice
public class ExceptionHandlerr {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity name(MethodArgumentNotValidException exception) {
		return new ResponseEntity<>(exception.getBindingResult().getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNameBlankException.class)
	public ResponseEntity<?> name(UserNameBlankException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
