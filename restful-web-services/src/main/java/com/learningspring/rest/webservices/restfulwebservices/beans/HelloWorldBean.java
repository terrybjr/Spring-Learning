package com.learningspring.rest.webservices.restfulwebservices.beans;

public class HelloWorldBean {
	private String message;

	public HelloWorldBean(final String pMessage) {
		super();
		this.message = pMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(final String pMessage) {
		this.message = pMessage;
	}
}
