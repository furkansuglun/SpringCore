package _03.namedParameter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import _03.namedParameter.domain.Person;

public class PersonRowMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Person person = new Person();
		
		person.setID(rs.getInt("ID"));
		person.setName(rs.getString("name"));
		person.setSurname(rs.getString("surname"));
		person.setBirthYear(rs.getInt("birthyear"));
		
		return person;
		
		
	}

}
