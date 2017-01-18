package _02.jdbcTemplate.domain;

public class Person {

	private int ID;
	private String name;
	private String surname;
	private int birthYear;
	
	
	
	public Person(int iD, String name, String surname, int birthYear) {
		super();
		ID = iD;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", surname=" + surname + ", birthYear=" + birthYear + "]";
	}
	
	
	
}
