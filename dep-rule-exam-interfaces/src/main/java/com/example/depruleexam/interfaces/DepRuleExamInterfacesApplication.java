package com.example.depruleexam.interfaces;

import com.example.depruleexam.domain.DomainPackages;
import com.example.depruleexam.domain.Person;
import com.example.depruleexam.domain.PersonRepository;
import com.example.depruleexam.jpa.JpaPackages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackageClasses = {DomainPackages.class, InterfacesPackages.class, JpaPackages.class})
@EntityScan(basePackageClasses = {JpaPackages.class})
public class DepRuleExamInterfacesApplication {

	private PersonRepository personRepository;

	public DepRuleExamInterfacesApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DepRuleExamInterfacesApplication.class, args);
	}

	@PostConstruct
	public void initDb() {
		for (int i = 0; i < 10; i++) {
			Person person = new Person("person" + i);
			System.out.println("++++++++p: " + person);
			Person saved = personRepository.save(person);
			System.out.println("++++++++saved: " + saved);
		}
	}
}
