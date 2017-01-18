package _03.annotation.based.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import _03.annotation.based.domain.Person;

//bir sýnýfta @Configuration annotation kullandýðýmýzda bu sýnýfta bean tanýmlarýný yapacaðýmýzý 
//spiring' e belirtioruz.

@Configuration
@ComponentScan(basePackages="_03")
@PropertySource(value = "classpath:03.annotation.based.properties")
@ImportResource(value = "classpath:03.annotation.based.xml")     	//xml configuration dosyamýz
public class AnnotationConfiguration {

	@Autowired
	private Environment enviroment; //enviroment interface sayesinde ilgili properties dosyasindan property çekebiliyoruz 
	
	//daha çok spring'in kendisine ait özel bean'lerinin oluþturulmasýn bu iþlemleri yapýyoru
	//burada örnek olmasý açýsýndan person class'ý üzerinden ean tanýmý yapacaðýz.
	@Bean
	public Person getPerson() {
		String personName = enviroment.getProperty("name");
		String personSurname = enviroment.getProperty("surname");
		
		return new Person(personName, personSurname);
	}
	
	
}
