package _02.JSR330.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _02.JSR330.domain.Person;
import _02.JSR330.service.PersonService;



public class Example {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.JSR330.component.scan.xml");
		
		PersonService personService = context.getBean(PersonService.class);
		
		Person person = new Person();
		
		person.setName("username");
		
		personService.insertPerson(person);
		
		context.close();
	}
	
}
