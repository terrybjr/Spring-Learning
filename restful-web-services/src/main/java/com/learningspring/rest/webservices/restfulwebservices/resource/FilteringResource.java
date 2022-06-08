package com.learningspring.rest.webservices.restfulwebservices.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningspring.rest.webservices.restfulwebservices.beans.SomeBean;

@RestController
public class FilteringResource {

	@GetMapping("/filtering")
	public SomeBean getSomeBean() {
		return new SomeBean("value1", "value2", "value3");
	}
}
