package _01.setter.injection;

public class Person {

	private String name;
	private String surname;
	private long salary;
	private int birthDay;
	private char gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set name");
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		System.out.println("set surname");
		this.surname = surname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		System.out.println("set salary");
		this.salary = salary;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		System.out.println("set birthday");
		this.birthDay = birthDay;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		System.out.println("set gender");
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", salary=" + salary + ", birthDay=" + birthDay
				+ ", gender=" + gender + "]";
	}
	
	
	
	
	
}
