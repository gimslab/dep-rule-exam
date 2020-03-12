package com.example.depruleexam.domain;

public interface PersonRepository {

	Person findById(Long id);
	Person save(Person person);
}
