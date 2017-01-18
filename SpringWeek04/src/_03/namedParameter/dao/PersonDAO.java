package _03.namedParameter.dao;

import java.util.List;

import _03.namedParameter.domain.Person;


public interface PersonDAO {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delete(int id);
	
}
