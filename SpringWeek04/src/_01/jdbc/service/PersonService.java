package _01.jdbc.service;

import java.util.List;

import _01.jdbc.domain.Person;

public interface PersonService {

	
	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delet(int id);
	
	public Person createPerson(int id , String name , String surname , int birthYear);
	
	
}
