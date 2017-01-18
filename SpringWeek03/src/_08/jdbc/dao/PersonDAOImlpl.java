package _08.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;



import _08.jdbc.domain.Person;

public class PersonDAOImlpl implements PersonDAO {

	private final static String INSERT_PERSON = "insert into person(ID,name,surname,birthyear) values(?,?,?,?) ";
	
	private DataSource dataSource; //yardýmý ile connection larý yönetiyoruz.
	
	
	
	//dataSource ' u xml ile setter injection yaptýgýmýz için getter/setter olusturuyoruz
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
	@Override
	public void insertPerson(Person person) {
		// TODO Auto-generated method stub
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
			preparedStatement.setInt(1, person.getID());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getSurname());
			preparedStatement.setInt(4, person.getBirthYear());
			
			preparedStatement.executeUpdate();
			preparedStatement.close();
			
			//
			
			System.out.println("insert...... " + person);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
