package _04.bean.aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("04.beanAware.xml");
		
		AwareWriter awareWriter = context.getBean(AwareWriter.class);
		
		context.close();
		
	}
	
}
