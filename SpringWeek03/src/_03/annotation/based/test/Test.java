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
		
		
		//properties dosyam�z sadece �rnek ama�l� �yle bir dosyadan faydalanabilece�imiz g�stermek ama�l� olusturulustur.
		//setName ile name verip sonucu g�rebilriiz.
		//person.setName("ALi");
		
		System.out.println(person);
		
		
		//
		//
		
		Student student = context.getBean(Student.class);
		
		//bean xml config ile olusturuldu 
		System.out.println(student);
		
		
		
		//burada hem properties ile hemde xml ile gelen value lar�m�z� annotationconfiguration class ' �m�za tan�tarak
		//sonuc elde etmeyi g�rm�� olduk
		
		
	}

}
