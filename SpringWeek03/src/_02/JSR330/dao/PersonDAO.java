package _02.JSR330.dao;

import _02.JSR330.domain.Person;

public interface PersonDAO {

	public void insertPerson(Person person);
	
	public Person getPersonById(int id);
	
}
