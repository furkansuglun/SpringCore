package _12.autowiring.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	private String name;
	private String surname;
	//
	
	// birden fazla Address bean tanimli oldugu icin ; @Qualifier annotationini
	// kullanmamiz gereklidir.
	/*
	 * 
	 * WARNING: Exception encountered during context initialization - cancelling
	 * refresh attempt:
	 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error
	 * creating bean with name 'personId': Unsatisfied dependency expressed
	 * through field 'address'; nested exception is
	 * org.springframework.beans.factory.NoUniqueBeanDefinitionException
	 * 
	 */
	@Autowired
	@Qualifier(value = "addressId")
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", address=" + address + "]";
	}

}
