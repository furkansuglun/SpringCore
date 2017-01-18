package _01.dao;

import _01.domain.Person;

public interface PersonDAO {
	
	public void insertPerson(Person person);
	
	public Person getPersonById(int id);
	
}
