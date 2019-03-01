package com.test.angulardemo.model;

import java.io.Serializable;

public class Person implements Serializable {
	private int id;
	private String firstName;
	private String lastName;
	private String profession;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession( String profession ) {
		this.profession = profession;
	}
}
