package com.learningspring.rest.webservices.restfulwebservices.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
import com.learningspring.rest.webservices.restfulwebservices.entity.Post;
import com.learningspring.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import com.learningspring.rest.webservices.restfulwebservices.repository.UserRepository;

@RestController
public class UserJPAResource {
	@Autowired
	UserDaoService userDaoService;

	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "jpa/user/getAll")
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	@PostMapping(path = "jpa/user")
	public ResponseEntity<?> createUser(@Valid @RequestBody final User user) {
		User newUser = this.userRepository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping(path = "jpa/user/{id}")
	public User getUser(@PathVariable final int id) {
		User user = this.userRepository.getById(id);
		if (user == null) {
			throw new UserNotFoundException("id-" + id);
		}
		return user;
	}

	@DeleteMapping(path = "jpa/user/remove/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable final int id) {
		this.userRepository.delete(this.getUser(id));
		return ResponseEntity.noContent().build();
	}

	@GetMapping(path = "jpa/user/{id}/posts")
	public List<Post> getUserPosts(@PathVariable final int id) {
		Optional<User> optUser = this.userRepository.findById(id);
		if (!optUser.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}
		return optUser.get().getPosts();
	}
}
