package _04.jpa.service;

import java.util.List;

import _04.jpa.dao.PersonDAOImpl;
import _04.jpa.domain.Person;


public class PersonServiceImpl {

	private PersonDAOImpl personDAOImpl;

	public PersonServiceImpl(PersonDAOImpl personDAOImpl) {
		super();
		this.personDAOImpl = personDAOImpl;
	}

	public void insert(Person person) {
		personDAOImpl.insert(person);
	}

	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	public void update(Person person) {
		personDAOImpl.update(person);
	}

	public void delete(int id) {
		personDAOImpl.delete(id);
	}

	public Person createPerson( String name, String surname, int birthYear) {
		Person person = new Person(name, surname, birthYear);
		return person;
	}

}
