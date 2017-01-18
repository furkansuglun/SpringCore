package _03.annotation.based.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _03.annotation.based.configuration.AnnotationConfiguration;
import _03.annotation.based.domain.Person;
import _03.annotation.based.domain.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		
		Person person = context.getBean(Person.class);
		
		
		//properties dosyamýz sadece örnek amaçlý öyle bir dosyadan faydalanabileceðimiz göstermek amaçlý olusturulustur.
		//setName ile name verip sonucu görebilriiz.
		//person.setName("ALi");
		
		System.out.println(person);
		
		
		//
		//
		
		Student student = context.getBean(Student.class);
		
		//bean xml config ile olusturuldu 
		System.out.println(student);
		
		
		
		//burada hem properties ile hemde xml ile gelen value larýmýzý annotationconfiguration class ' ýmýza tanýtarak
		//sonuc elde etmeyi görmüþ olduk
		
		
	}

}
