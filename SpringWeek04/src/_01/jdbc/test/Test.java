package _01.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.jdbc.dao.PersonDAO;
import _01.jdbc.domain.Person;
import _01.jdbc.service.PersonService;
import _01.jdbc.service.PersonServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("01.jdbc.xml");
		
		PersonServiceImpl personService = context.getBean("personServiceImplId",PersonServiceImpl.class);
		
		Person person = personService.createPerson(4, "furkan", "suglun", 1994);
		
		
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
		
		personService.delet(3);
		System.out.println("AFTER DELETE ÝD = 1");
		personService.getAllPersons();
		
		context.close();
	}

}
