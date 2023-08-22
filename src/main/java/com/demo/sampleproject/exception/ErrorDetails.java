package com.demo.sampleproject.exception;

public class ErrorDetails {
     
	
	private String errorMsg;
	private String errorDetails;

	
	public ErrorDetails(String errormessage, String errordetails) {
		this.errorMsg=errormessage;
		this.errorDetails=errordetails;
	}


	public String getErrorMsg() {
		return errorMsg;
	}


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	public String getErrorDetails() {
		return errorDetails;
	}


	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}


	@Override
	public String toString() {
		return "ErrorDetails [errorMsg=" + errorMsg + ", errorDetails=" + errorDetails + "]";
	}
	
	
	
}
