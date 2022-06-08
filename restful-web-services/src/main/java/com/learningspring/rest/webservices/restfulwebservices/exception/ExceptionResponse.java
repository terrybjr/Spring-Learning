package com.learningspring.rest.webservices.restfulwebservices.exception;

import java.util.Date;


public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionResponse(final Date pTimestamp, final String pMessage, final String pDetails) {
		super();
		this.timestamp = pTimestamp;
		this.message = pMessage;
		this.details = pDetails;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(final Date pTimestamp) {
		this.timestamp = pTimestamp;
	}
	public String getMessage() {
		return this.message;
	}

	public void setMessage(final String pMessage) {
		this.message = pMessage;
	}
	public String getDetails() {
		return this.details;
	}

	public void setDetails(final String pDetails) {
		this.details = pDetails;
	}



}
