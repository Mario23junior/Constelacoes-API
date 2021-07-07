package com.project.constelacoes.ExceptionHandler;

import java.util.List;

public class ErroResponse {
   
	private String message;
	private int code;
	private String status;
	private String objectName;
	private List<ErrosObject> erros;
	
	public ErroResponse(String message, int code, String status, String objectName, List<ErrosObject> erros) {
		super();
		this.message = message;
		this.code = code;
		this.status = status;
		this.objectName = objectName;
		this.erros = erros;
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
	public List<ErrosObject> getErros() {
		return erros;
	}
	public void setErros(List<ErrosObject> erros) {
		this.erros = erros;
	}

}
