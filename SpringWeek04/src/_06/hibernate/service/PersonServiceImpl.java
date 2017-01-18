package _06.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _06.hibernate.dao.PersonDAOImpl;
import _06.hibernate.domain.Person;


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

	public Person createPerson(int id, String name, String surname, int birthYear) {
		Person person = new Person(id,name, surname, birthYear);
		return person;
	}

}
