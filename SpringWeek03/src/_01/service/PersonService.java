package _01.service;

import _01.domain.Person;

public interface PersonService {

	
	public void insertPerson(Person person);
	
	public Person getPersonById(int id);
	
}
