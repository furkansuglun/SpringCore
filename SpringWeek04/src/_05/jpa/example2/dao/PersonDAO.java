package _05.jpa.example2.dao;

import java.util.List;

import _05.jpa.example2.domain.Person;



public interface PersonDAO {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delete(int id);
	
}
 