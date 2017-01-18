package _05.jpa.example2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _05.jpa.example2.dao.PersonDAOImpl;
import _05.jpa.example2.domain.Person;


@Service("personServiceImpl")
public class PersonServiceImpl {

	private PersonDAOImpl personDAOImpl;

	@Autowired
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
