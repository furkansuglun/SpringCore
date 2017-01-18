package _08.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//varsayýlan olarak bean'ler singleton dur.
		//spring her bean için sadece bir tane object oluþturur.
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("08.bean.scope");
		
		//default olarak singleton dur o yüzden true dönecektir
		Person person1 = context.getBean("person1",Person.class);
		Person person2 = context.getBean("person1",Person.class);
		
		System.out.println(person1==person2);
		
		//scope="prototype" oldugu için getBean her çaðýrýldýðýnda farklý object/instance döner.
		Person person3 = context.getBean("person2",Person.class);
		Person person4 = context.getBean("person2",Person.class);
		
		System.out.println(person3==person4);
		
	}
	
	
}
