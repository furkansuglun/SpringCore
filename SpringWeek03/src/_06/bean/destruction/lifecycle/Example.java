package _06.bean.destruction.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("06.bean.destruction.xml");
		
		DestructionWriter destructionWriter = context.getBean(DestructionWriter.class);
		
		context.close();
		
	}
	
}
