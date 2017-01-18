package _03.namedParameter.service;

import java.util.List;

import _03.namedParameter.dao.PersonDAOImpl;
import _03.namedParameter.domain.Person;



public class PersonServiceImpl implements PersonService{

	private PersonDAOImpl personDAOImpl;
	
	
	//constructor injection yapacagýz
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
		// TODO Auto-generated method stub
		return personDAOImpl.getPersonById(id);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDAOImpl.getAllPersons();
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		personDAOImpl.update(person);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personDAOImpl.delete(id);
	}

	@Override
	public Person createPerson(int id, String name, String surname, int birthYear) {
		// TODO Auto-generated method stub
		Person person = new Person(id, name, surname, birthYear);
		return person;
	}

}
