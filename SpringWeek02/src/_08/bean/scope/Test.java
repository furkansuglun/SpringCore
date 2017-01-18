package _08.bean.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//varsay�lan olarak bean'ler singleton dur.
		//spring her bean i�in sadece bir tane object olu�turur.
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("08.bean.scope");
		
		//default olarak singleton dur o y�zden true d�necektir
		Person person1 = context.getBean("person1",Person.class);
		Person person2 = context.getBean("person1",Person.class);
		
		System.out.println(person1==person2);
		
		//scope="prototype" oldugu i�in getBean her �a��r�ld���nda farkl� object/instance d�ner.
		Person person3 = context.getBean("person2",Person.class);
		Person person4 = context.getBean("person2",Person.class);
		
		System.out.println(person3==person4);
		
	}
	
	
}
