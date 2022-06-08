package com.learningspring.rest.webservices.restfulwebservices.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {
	private String someValue1;
	private String someValue2;
	@JsonIgnore
	private String someValue3;

	public SomeBean(final String pSomeValue1, final String pSomeValue2, final String pSomeValue3) {
		super();
		this.someValue1 = pSomeValue1;
		this.someValue2 = pSomeValue2;
		this.someValue3 = pSomeValue3;
	}

	public String getSomeValue1() {
		return this.someValue1;
	}

	public void setSomeValue1(final String pSomeValue1) {
		this.someValue1 = pSomeValue1;
	}

	public String getSomeValue2() {
		return this.someValue2;
	}

	public void setSomeValue2(final String pSomeValue2) {
		this.someValue2 = pSomeValue2;
	}

	public String getSomeValue3() {
		return this.someValue3;
	}

	public void setSomeValue3(final String pSomeValue3) {
		this.someValue3 = pSomeValue3;
	}

}
