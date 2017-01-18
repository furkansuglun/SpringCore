package _02.jdbcTemplate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import _02.jdbcTemplate.domain.Person;

public class PersonDAOImpl implements PersonDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new  JdbcTemplate(dataSource);
	}
	
	
	public static final String INSERT_PERSON = "insert into person(ID,name,surname,birthyear) values (?,?,?,?)";
	public static final String SELECT_BY_ID = "select * from person where ID = ?";
	public static final String SELECT_ALL = "select * from person";
	public static final String UPDATE_PERSON = "update person set name= ? , surname= ? , birthyear= ? where id= ?";
	public static final String DELETE_PERSON = "delete person where id = ?";
	
	
	
	@Override
	public void insert(Person person) {
		
		Object[] insertParams = new Object[] {person.getID(),person.getName(),person.getSurname(),person.getBirthYear()};
		
		jdbcTemplate.update(INSERT_PERSON , insertParams);
		
	}

	@Override
	public Person getPersonById(int id) {
		
		Object[] selectParams = new Object[] {id};
		
		Person person = jdbcTemplate.queryForObject(SELECT_BY_ID, selectParams , new PersonRowMapper()); 
		//personrowmmapper person döndürüyor geriye
		System.out.println("Person is found...");
		System.out.println(person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		
		List<Person> personList = jdbcTemplate.query(SELECT_ALL, new PersonRowMapper());
		
		for(Person p : personList) {
			System.out.println(p);
		}
		
		return personList;
	}

	@Override
	public void update(Person person) {
		Object[] updateParams = new Object[] {person.getName(),person.getSurname(),person.getBirthYear() , person.getID()};
		jdbcTemplate.update(UPDATE_PERSON);
	}

	@Override
	public void delete(int id) {
		
		jdbcTemplate.update(DELETE_PERSON,id);
	
	}

}
