package _01.jdbc.dao;

import java.util.List;

import _01.jdbc.domain.Person;

public interface PersonDAO {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delet(int id);
	
}
