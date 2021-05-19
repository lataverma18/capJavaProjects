package com.example.demo.exceptions;

public class CustomErrorResponse {

	String errorCode;
	String errorMsg;
	int status;
	public CustomErrorResponse(String errorCode, String errorMsg, int status) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}