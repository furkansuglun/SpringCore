package _05.bean.creation.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("05.bean.creation.xml");
		
		CreationWriter creationWriter = context.getBean(CreationWriter.class);
		 
		context.close();
	}
	
}
