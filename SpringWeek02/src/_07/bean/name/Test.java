package _07.bean.name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("07.bean.name.xml");
		
		Person person1     = context.getBean("person1" , Person.class);
		Person person2     = context.getBean("person2" , Person.class);
		Person person3     = context.getBean("person3" , Person.class);
		Person person4 	   = context.getBean("person4" , Person.class);
		Person person5 	   = context.getBean("person5" , Person.class);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
		System.out.println(person5);
		context.close();
	}
	
}
