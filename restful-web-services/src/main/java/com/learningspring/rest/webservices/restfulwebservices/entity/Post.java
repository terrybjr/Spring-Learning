package com.learningspring.rest.webservices.restfulwebservices.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.learningspring.rest.webservices.restfulwebservices.beans.User;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public int getId() {
		return this.id;
	}

	public void setId(final int pId) {
		this.id = pId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(final User pUser) {
		this.user = pUser;
	}

}
