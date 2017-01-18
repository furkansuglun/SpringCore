package _11.autowiring.constructor;

public class Person {

	private String name;
	private String surname;
	private Address address;
	
	
	
	
	public Person(Address address) {
		super();
		this.address = address;
	}
	
	
	
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
