package _02.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("02.constructor.injection.xml");
		
		Person person = context.getBean("personId",Person.class);

		System.out.println(person);
		
		Person person2 = context.getBean("personId2",Person.class);

		System.out.println(person2);
		
		ConstrutorConfuse confuse = context.getBean("confuseId" , ConstrutorConfuse.class);
		
		System.out.println(confuse);
		
		ConstrutorConfuse confuse2 = context.getBean("confuseId2" , ConstrutorConfuse.class);
		
		System.out.println(confuse2);
		
		ConstrutorConfuse confuse3 = context.getBean("confuseId3" , ConstrutorConfuse.class);
		
		System.out.println(confuse3);
		
		
		Computer computer = context.getBean("computerId" , Computer.class);
		
		System.out.println(computer);
	}

}
