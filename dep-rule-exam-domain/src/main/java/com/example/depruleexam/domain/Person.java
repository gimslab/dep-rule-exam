package com.example.depruleexam.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(Person person) {
		this(person.name);
	}

	@Override
	public String toString() {
		return "Person(" + name + ")";
	}
}
