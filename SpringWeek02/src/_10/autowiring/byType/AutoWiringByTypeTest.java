package _10.autowiring.byType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringByTypeTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("10.autowiring.bytype.xml");
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person);
		
		context.close();
		
	}
	
}
