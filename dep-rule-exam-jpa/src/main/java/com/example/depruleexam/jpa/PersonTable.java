package com.example.depruleexam.jpa;

import com.example.depruleexam.domain.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonTable extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public PersonTable() {
	}

	public PersonTable(Person person) {
		super(person);
	}

	@Override
	public String toString() {
		return "PersonTable(id:" + id + ", super=" + super.toString() + ")";
	}
}
