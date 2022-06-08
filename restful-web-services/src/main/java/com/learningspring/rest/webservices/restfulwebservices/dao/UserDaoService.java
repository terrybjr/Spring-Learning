package com.learningspring.rest.webservices.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.learningspring.rest.webservices.restfulwebservices.beans.User;

@Component
public class UserDaoService {
	private static List<User> userList = new ArrayList<>();

	static {
		userList.add(new User("Adam", new Date()));
		userList.add(new User("Eve", new Date()));
		userList.add(new User("Jack", new Date()));
	}

	public List<User> findAll() {
		return userList;
	}

	public User save(final User user) {
		if (user.getId() == 0) {
			user.setId(userList.size() + 1);
		}
		userList.add(user);
		return user;
	}

	public User findOne(final int userId) {
		Optional<User> user = userList.stream().filter(c -> c.getId() == userId).findFirst();
		if (!user.isPresent()) {
			return null;
		}
		return user.get();
	}

	public boolean deleteUser(final int pId) {
		return userList.removeIf(t -> t.getId() == pId);
	}
}
