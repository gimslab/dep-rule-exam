package com.example.depruleexam.domain;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public Person findById(Long id) {
		Person p = personRepository.findById(id);
		return p;
	}
}
