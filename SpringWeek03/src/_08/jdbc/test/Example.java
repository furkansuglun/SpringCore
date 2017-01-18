package _08.jdbc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import _08.jdbc.dao.PersonDAO;
import _08.jdbc.domain.Person;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("08.jdbc.xml");
		
		PersonDAO dao = context.getBean(PersonDAO.class);
		
		Person person = new Person(100 , "Furkan" , "Suglun" , 1994);
		
		dao.insertPerson(person);
		
		context.close();
	}
	
	
	//java 8 kullanmam gerekiyor !!
	

}
