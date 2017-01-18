package _03.namedParameter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import _03.namedParameter.domain.Person;


public class PersonDAOImpl implements PersonDAO {


	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	
	//named parameter = SQL sorgusunda ? yerine :deðiþkenAdi veriyoruz
	
	public static final String INSERT_PERSON = "insert into person(ID,name,surname,birthyear) values (:id,:name,:surname,:birthYear)";
	public static final String SELECT_BY_ID = "select * from person where ID = :id";
	public static final String SELECT_ALL = "select * from person";
	public static final String UPDATE_PERSON = "update person set name= :name , surname= :surname , birthyear= :birthYear where id= :id";
	public static final String DELETE_PERSON = "delete person where id = :id";
	
	
	
	@Override
	public void insert(Person person) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", person.getID());
		params.put("name", person.getName());
		params.put("surname", person.getSurname());
		params.put("birthYear", person.getBirthYear());
		
		namedParameterJdbcTemplate.update(INSERT_PERSON, params);
		
		System.out.println("person inserted..");
		System.out.println(person);
	}

	@Override
	public Person getPersonById(int id) {
		
		SqlParameterSource selectParam = new MapSqlParameterSource().addValue("id", id);
		
		Person person = namedParameterJdbcTemplate.queryForObject(SELECT_BY_ID, selectParam, new PersonRowMapper());
			 
		System.out.println("Person is found...");
		System.out.println(person);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		
		List<Person> personList = namedParameterJdbcTemplate.query(SELECT_ALL, new PersonRowMapper());
		
		for(Person p : personList) {
			System.out.println(p);
		}
		
		return personList;
	}

	@Override
	public void update(Person person) {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id", person.getID());
		params.put("name", person.getName());
		params.put("surname", person.getSurname());
		params.put("birthYear", person.getBirthYear());
		
		//SqlParameterSource params = new BeanPropertySqlParameterSource(person);
		
		namedParameterJdbcTemplate.update(UPDATE_PERSON, params);
		 
		System.out.println("person updated..");
		System.out.println(person);
	}

	@Override
	public void delete(int id) {
		
		SqlParameterSource params = new MapSqlParameterSource().addValue("id", id);
		
		namedParameterJdbcTemplate.update(DELETE_PERSON, params);
	
		System.out.println("person deleted");
		
	}

}
