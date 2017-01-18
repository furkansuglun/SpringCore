package _03.collection.injection;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("03.collection.injection.xml");

		CollectionInjectionModel model = context.getBean(CollectionInjectionModel.class);

		System.out.println(model);

		context.close();
		
		
	}
	
}
