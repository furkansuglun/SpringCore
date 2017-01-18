package _07.messages;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("07.messages.xml");
		
		String productName = context.getMessage("product.name", null , Locale.UK);
		
		String productNameTr = context.getMessage("product.name", null , new Locale("tr", "TR"));
		
		System.out.println(productName);
		
		System.out.println(productNameTr);
		
	}

}
