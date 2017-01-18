package _06.expression.language.annotation;

import org.springframework.stereotype.Service;

@Service("configAnnotationId")
public class ConfigAnnotation {

	private String name = "username";
	private String password = "userpassword";
	
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
		return "ConfigAnnotation [name=" + name + ", password=" + password + "]";
	}
	
	
	
}
