package _02.JSR330.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import _02.JSR330.dao.PersonDAO;
import _02.JSR330.domain.Person;



//@Service(value="myService")
@Named
@Singleton
public class PersonServiceImpl implements PersonService{

	//@Autowired
	@Inject
	private PersonDAO personDAO;
	
	@Override
	public void insertPerson(Person person) {
		//
		//çeþitli kontroller olabilir /bussiness logic
		
		System.out.println("PersonServiceImpl#insertPerson");
		personDAO.insertPerson(person);
	}

	@Override
	public Person getPersonById(int id) {
		//
		//
		return personDAO.getPersonById(id);
		
	}

}
