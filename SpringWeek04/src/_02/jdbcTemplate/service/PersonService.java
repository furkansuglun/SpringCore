package _02.jdbcTemplate.service;

import java.util.List;

import _02.jdbcTemplate.domain.Person;

public interface PersonService {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delete(int id);
	
	public Person createPerson(int id ,String name ,String surname , int birthYear);
	
}
