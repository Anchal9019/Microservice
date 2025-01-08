package com.example.employee_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(DataNotFoundException.class)
public ResponseEntity<String> dataNotFound(DataNotFoundException dataNotFoundexception){
	return new ResponseEntity<String> (dataNotFoundexception.getMessage(),HttpStatus.NOT_FOUND);
	
}
}
