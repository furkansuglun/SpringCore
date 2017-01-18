package _06.expression.language.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressionLanguageAnnotationInjectionTest {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("06.expression.language.annotation.xml");
		
		PersonAnnotation personAnnotation = context.getBean("personAnnotationId" , PersonAnnotation.class);
		
		System.out.println(personAnnotation);
		
	}
}
