package _02.constructor.injection;

public class Person {

	private String name;
	private String surname;
	private long salary;
	private int birthDay;
	private char gender;
	
	
	
	public Person(String name, String surname, long salary, int birthDay, char gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.birthDay = birthDay;
		this.gender = gender;
		
		System.out.println("person constructor is called");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", salary=" + salary + ", birthDay=" + birthDay
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
}
