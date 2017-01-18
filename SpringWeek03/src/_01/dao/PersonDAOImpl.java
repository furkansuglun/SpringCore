package _01.dao;

import org.springframework.stereotype.Repository;

import _01.domain.Person;

@Repository			//(value="personDAOImpl")
public class PersonDAOImpl implements PersonDAO{

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
