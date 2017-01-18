package _01.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _01.spring.model.Car;

public class SpringTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("01.applicationContext.xml");
		
		//getBean --> dependency Lookup yakla��m�d�r .. new object �eklinde de�ilde getle ula��yoruz objeye
		Car carForLassa = context.getBean("carIdForLassa" , Car.class);
		carForLassa.drive();
		
		Car carForGoodYear = context.getBean("carIdForGoodYear" , Car.class);
		carForGoodYear.drive();
	}
	
}
