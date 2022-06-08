package com.learningspring.rest.webservices.restfulwebservices.resource;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learningspring.rest.webservices.restfulwebservices.beans.User;
import com.learningspring.rest.webservices.restfulwebservices.dao.UserDaoService;
import com.learningspring.rest.webservices.restfulwebservices.exception.UserNotFoundException;

@RestController
public class UserResource {
	@Autowired
	UserDaoService userDaoService;

	@GetMapping(path = "user/getAll")
	public List<User> getAllUsers() {
		return this.userDaoService.findAll();
	}

	@PostMapping(path = "user")
	public ResponseEntity<?> createUser(@Valid @RequestBody final User user) {
		User newUser = this.userDaoService.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path = "user/{id}")
	public User getUser(@PathVariable final int id) {
		User user = this.userDaoService.findOne(id);
		if (user == null) {
			throw new UserNotFoundException("id-" + id);
		}
		return user;
	}

	@DeleteMapping(path = "user/remove/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable final int id) {
		if (!this.userDaoService.deleteUser(id)) {
			throw new UserNotFoundException("id-" + id);
		}
		return ResponseEntity.noContent().build();
	}
}
