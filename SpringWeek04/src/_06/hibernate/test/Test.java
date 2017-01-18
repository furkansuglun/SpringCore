package _06.hibernate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _06.hibernate.domain.Person;
import _06.hibernate.service.PersonServiceImpl;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("06.hibernate.xml");

		PersonServiceImpl pService = context.getBean( PersonServiceImpl.class);

		// create person object

		Person person1 = pService.createPerson(1, "Tolga", "Ergun", 1892);
		Person person2 = pService.createPerson(2, "Ugur", "Cetin", 1990);

		// /
		pService.insert(person1);
		pService.insert(person2);

		Person person3 = pService.getPersonById(7);
		

		//
		person1.setBirthYear(1992);
		pService.update(person1);
		
		//
		List<Person> personList=pService.getAllPersons();
		
		for(Person p: personList){
			System.out.println(p);
		}
		//
		pService.delete(1);
		
		
		//
		pService.getAllPersons();
		
	}
}
