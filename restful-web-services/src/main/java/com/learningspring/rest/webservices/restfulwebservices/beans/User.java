package com.learningspring.rest.webservices.restfulwebservices.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.learningspring.rest.webservices.restfulwebservices.entity.Post;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 2, message = "Name should have at least 2 characters.")
	private String name;
	@Past
	private Date birthDate;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Post> posts;

	public User() {
		super();
	}

	public User(final String pName, final Date pBirthDate) {
		super();
		this.name = pName;
		this.birthDate = pBirthDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int pId) {
		this.id = pId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String pName) {
		this.name = pName;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(final Date pBirthDate) {
		this.birthDate = pBirthDate;
	}

	public void setPosts(final List<Post> pPosts) {
		this.posts = pPosts;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	@Override
	public String toString() {
		return "User [id=" + this.id + ", name=" + this.name + ", birthDate=" + this.birthDate + ", posts=" + this.posts
				+ "]";
	}


}
