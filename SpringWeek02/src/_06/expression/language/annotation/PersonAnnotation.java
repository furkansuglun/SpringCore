package _06.expression.language.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("personAnnotationId")
public class PersonAnnotation {
	
	@Value(value="#{configAnnotationId.name}")
	private String name;
	
	@Value(value="#{configAnnotationId.password}")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PersonAnnotation [name=" + name + ", password=" + password + "]";
	}
	
	
	
	
}
