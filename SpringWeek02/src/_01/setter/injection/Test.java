package _01.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("01.setter.injection.xml");
		Person person = context.getBean("personId" , Person.class);
		System.out.println(person);
		
		Person person2 = context.getBean("personId2" , Person.class);
		System.out.println(person2);
		
		Computer computer = context.getBean("computerId", Computer.class);
		
		System.out.println(computer);
	}

}
