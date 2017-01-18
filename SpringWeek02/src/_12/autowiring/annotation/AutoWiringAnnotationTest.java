package _12.autowiring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringAnnotationTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("12.autowiring.annotation.xml");

		Person person = context.getBean(Person.class);

		System.out.println(person);
		
		context.close();
	}
}
