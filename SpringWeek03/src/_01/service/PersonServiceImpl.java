package _01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _01.dao.PersonDAO;
import _01.domain.Person;

@Service(value="myService")
public class PersonServiceImpl implements PersonService{

	@Autowired
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
