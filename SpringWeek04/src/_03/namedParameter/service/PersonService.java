package _03.namedParameter.service;

import java.util.List;

import _03.namedParameter.domain.Person;

public interface PersonService {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delete(int id);
	
	public Person createPerson(int id ,String name ,String surname , int birthYear);
	
}
