package com.project.constelacoes.ExceptionHandler;

public class ErroResponse {
   
	private String message;
	private int code;
	private String status;
	private String objectName;
	
	public ErroResponse(String message, int code, String status, String objectName) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	
	
	
	
}
