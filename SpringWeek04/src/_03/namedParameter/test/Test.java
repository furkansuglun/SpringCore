package _03.namedParameter.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _03.namedParameter.domain.Person;
import _03.namedParameter.service.PersonServiceImpl;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("03.namedParameter.xml");
		
		PersonServiceImpl personService = context.getBean("personServiceImplId",PersonServiceImpl.class);
		
		Person person = personService.createPerson(7, "furkan", "suglun", 1994);
		
		
		personService.getAllPersons();
		System.out.println("\n");
		
		personService.insert(person);
	
		personService.getPersonById(2);
		
		
		person.setBirthYear(9999);
		
		personService.update(person);
		System.out.println("AFTERE UPDATE");
		personService.getAllPersons();
		
		personService.delete(5);
		System.out.println("AFTER DELETE ÝD = 1");
		personService.getAllPersons();
		
		context.close();
	}

}
