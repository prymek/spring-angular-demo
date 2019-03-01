package com.test.angulardemo.service;

import com.test.angulardemo.model.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	Map<Integer, Person> persons = new HashMap<>();

	public Collection<Person> getPersonsList() {
		return persons.values();
	}

	public void addPerson( Person person ) {
		persons.put( person.getId(), person );
	}

	public void removePerson( int id ) {
		persons.remove( id );
	}
}
