package _05.expression.language;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressionLanguageTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("05.expression.language.xml");
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person);
	}
	
}
