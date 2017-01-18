package _09.autowiring.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringByNameTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("09.autowiring.byname.xml");
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person);
		
		context.close();
		
	}
	
}
