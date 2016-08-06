package com.blog.mvc.controllers;

public class GenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public String errCode;
	public String errMsg;

	//getter and setter methods

	public GenericException(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
		System.out.println("const");
	}


}
