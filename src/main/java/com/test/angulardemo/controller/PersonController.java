package com.test.angulardemo.controller;

import com.test.angulardemo.model.Person;
import com.test.angulardemo.service.PersonService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( "/person" )
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping( "getPersons" )
	public Collection<Person> getPersons() {
		return personService.getPersonsList();
	}

	@PostMapping( "addPerson" )
	public void addPerson( @RequestBody Person person ) {
		personService.addPerson( person );
	}

	@PostMapping( "removePerson" )
	public void addPerson( @RequestBody int personId ) {
		personService.removePerson( personId );

	}
}
