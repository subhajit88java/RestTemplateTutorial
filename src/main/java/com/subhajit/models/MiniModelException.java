package com.subhajit.models;

import org.springframework.http.HttpStatus;

public class MiniModelException {

	private Integer code;
	private String statusCode;
	
	public MiniModelException(Integer code, String statusCode) {
		super();
		this.code = code;
		this.statusCode = statusCode;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	

	@Override
	public String toString() {
		return "MiniModelException [code=" + code + ", statusCode=" + statusCode + "]";
	}
	
	
}
