package _03.annotation.based.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import _03.annotation.based.domain.Person;

//bir s�n�fta @Configuration annotation kulland���m�zda bu s�n�fta bean tan�mlar�n� yapaca��m�z� 
//spiring' e belirtioruz.

@Configuration
@ComponentScan(basePackages="_03")
@PropertySource(value = "classpath:03.annotation.based.properties")
@ImportResource(value = "classpath:03.annotation.based.xml")     	//xml configuration dosyam�z
public class AnnotationConfiguration {

	@Autowired
	private Environment enviroment; //enviroment interface sayesinde ilgili properties dosyasindan property �ekebiliyoruz 
	
	//daha �ok spring'in kendisine ait �zel bean'lerinin olu�turulmas�n bu i�lemleri yap�yoru
	//burada �rnek olmas� a��s�ndan person class'� �zerinden ean tan�m� yapaca��z.
	@Bean
	public Person getPerson() {
		String personName = enviroment.getProperty("name");
		String personSurname = enviroment.getProperty("surname");
		
		return new Person(personName, personSurname);
	}
	
	
}
