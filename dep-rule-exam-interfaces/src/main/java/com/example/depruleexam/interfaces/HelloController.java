package com.example.depruleexam.interfaces;

import com.example.depruleexam.domain.Person;
import com.example.depruleexam.domain.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private PersonService personService;

	public HelloController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/person")
	@ResponseBody
	public String person(Long id) {
		Person p = personService.findById(id);
		return "found:" + p + " for id:" + id;
	}
}
