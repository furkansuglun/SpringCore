package _02.jdbcTemplate.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _02.jdbcTemplate.domain.Person;
import _02.jdbcTemplate.service.PersonServiceImpl;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.jdbcTemplate.xml");
		
		PersonServiceImpl personService = context.getBean("personServiceImplId",PersonServiceImpl.class);
		
		Person person = personService.createPerson(5, "furkan", "suglun", 1994);
		
		
		personService.getAllPersons();
		System.out.println("\n");
		
		personService.insert(person);
	
		
		int id = 1;
		System.out.println("ID = "+id+" olan person " );
		personService.getPersonById(id);
		
		
		person.setBirthYear(9999);
		
		personService.update(person);
		System.out.println("AFTERE UPDATE");
		personService.getAllPersons();
		
		personService.delete(4);
		System.out.println("AFTER DELETE ÝD = 1");
		personService.getAllPersons();
		
		context.close();
	}

}
