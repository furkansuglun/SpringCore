package _02.JSR330.dao;

import javax.inject.Named;
import javax.inject.Singleton;

import _02.JSR330.domain.Person;

//@Repository
@Named
@Singleton
public class PersonDAOImpl implements PersonDAO {

	@Override
	public void insertPerson(Person person) {
		// TODO Auto-generated method stub
		System.out.println("PersonDAOImpl#insertPerson");
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
