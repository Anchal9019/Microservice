package com.example.employee_service.exception;

public class DataNotFoundException extends RuntimeException {
public DataNotFoundException(String mssg) {
	super(mssg);
}
}
