package _11.autowiring.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringConstructorTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("11.autowiring.constructor.xml");
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person);
		
		context.close();
		
	}
	
}
