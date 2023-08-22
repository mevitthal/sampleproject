package com.demo.sampleproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ErrorDetails> EmployeeNotFoundException(EmployeeNotFoundException exception){
		 
		ErrorDetails errordetails=new ErrorDetails(exception.getMessage(),"employee record not found");
		return new ResponseEntity<ErrorDetails>(errordetails,HttpStatus.OK);
	
	}
	
	@ExceptionHandler(EmployeeNotSavedToDatabaseException.class)
	public <EmployeeNotSaveException> ResponseEntity<ErrorDetails>EmployeeNotSaveException(EmployeeNotSavedToDatabaseException exception) {
		ErrorDetails errordetails=new ErrorDetails(exception.getMessage(),"employee not saved to database please try again");
		
		return new ResponseEntity<ErrorDetails>(errordetails,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	

}
