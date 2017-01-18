package _02.JSR330.service;

import _02.JSR330.domain.Person;

public interface PersonService {

	
	public void insertPerson(Person person);
	
	public Person getPersonById(int id);
	
}
