package _01.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.domain.Person;
import _01.service.PersonService;

public class Example {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("01.component.scan.xml");
		
		PersonService personService = context.getBean("myService",PersonService.class);
		
		Person person = new Person();
		
		person.setName("username");
		
		personService.insertPerson(person);
		
		context.close();
	}
	
}
