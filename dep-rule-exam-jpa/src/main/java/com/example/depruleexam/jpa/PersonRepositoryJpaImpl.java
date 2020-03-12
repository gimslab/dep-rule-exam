package com.example.depruleexam.jpa;

import com.example.depruleexam.domain.Person;
import com.example.depruleexam.domain.PersonRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepositoryJpaImpl implements PersonRepository {
	private EntityManager entityManager;

	public PersonRepositoryJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Person save(Person p) {
		return entityManager.merge(new PersonTable(p));
	}

	@Override
	public PersonTable findById(Long id) {
		return entityManager.find(PersonTable.class, id);
	}
}
