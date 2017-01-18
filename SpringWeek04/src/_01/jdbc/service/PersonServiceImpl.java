package _01.jdbc.service;

import java.util.List;

import _01.jdbc.dao.PersonDAOImpl;
import _01.jdbc.domain.Person;

public class PersonServiceImpl implements PersonService{

	private PersonDAOImpl personDAOImpl;
	
	//bean tanýmýnda constructor injection yapýyoruz
	public PersonServiceImpl(PersonDAOImpl personDAOImpl) {
		super();
		this.personDAOImpl = personDAOImpl;
	}

	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		personDAOImpl.insert(person);
	}

	@Override
	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	@Override
	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	@Override
	public void update(Person person) {
		personDAOImpl.update(person);
	}

	@Override
	public void delet(int id) {
		personDAOImpl.delet(id);
	}
	
	@Override
	public Person createPerson(int id , String name , String surname , int birthYear) {
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}

}
