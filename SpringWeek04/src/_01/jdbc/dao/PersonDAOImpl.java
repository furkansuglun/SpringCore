package _01.jdbc.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.api.mysqla.result.Resultset;

import _01.jdbc.domain.Person;

public class PersonDAOImpl implements PersonDAO {

	private DataSource dataSource; 
	//data source yardýmý ile connection larý yönetiyoruz.Connection connection = dataSource.getConnection(); gibi..
	
	
	//dataSource ' u xml ile setter injection yaptýgýmýz için getter/setter olusturuyoruz
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	public static final String INSERT_PERSON = "insert into person(ID,name,surname,birthyear) values (?,?,?,?)";
	public static final String SELECT_BY_ID = "select * from person where ID = ?";
	public static final String SELECT_ALL = "select * from person";
	public static final String UPDATE_PERSON = "update person set name= ? , surname= ? , birthyear= ? where id= ?";
	public static final String DELETE_PERSON = "delete person where id = ?";
	
	
	private Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public void insert(Person person) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement ps=null;
		try {
			
			ps = connection.prepareStatement(INSERT_PERSON);
			ps.setInt(1, person.getID());
			ps.setString(2, person.getName());
			ps.setString(3, person.getSurname());
			ps.setInt(4, person.getBirthYear());
			
			ps.executeUpdate(); 
			ps.close();
			
			System.out.println("Person inserted....");
			System.out.println(person);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement ps = null;
		
		Person person = null;
		
		try {
			ps = connection.prepareStatement(SELECT_BY_ID);
			ps.setInt(1, id);
			
			ResultSet resultset = ps.executeQuery();
			
			if(resultset.next()) {
				String name = resultset.getString("name");
				String surname = resultset.getString("surname");
				int birthYear = resultset.getInt("birthyear");
				
				person = new Person(id, name, surname, birthYear);
				//
				System.out.println("Person is found...");
				System.out.println(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	}


	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement ps = null;
		
		Person person = null;
		List<Person> personList = new ArrayList<Person>();
		
		try {
			ps = connection.prepareStatement(SELECT_ALL);
			
			ResultSet resultset = ps.executeQuery();
			
			while (resultset.next()) {
				int id = resultset.getInt("ID");
				String name = resultset.getString("name");
				String surname = resultset.getString("surname");
				int birthYear = resultset.getInt("birthyear");
				
				person = new Person(id, name, surname, birthYear);
				
				personList.add(person);
				
				
				}
			
			System.out.println("All Person...");
			
			for(Person p : personList) {
				System.out.println(p);
			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personList;
	}


	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement ps=null;
		try {
			
			ps = connection.prepareStatement(UPDATE_PERSON);
			//1,2,3,4 parametre sql sorgusundaki sýrasý önemli !! 
			ps.setString(1, person.getName());
			ps.setString(2, person.getSurname());
			ps.setInt(3, person.getBirthYear());
			ps.setInt(4, person.getID());
			
			
			ps.executeUpdate(); 
			ps.close();
			
			System.out.println("Person updated....");
			System.out.println(person);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void delet(int id) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement ps=null;
		try {
			
			ps = connection.prepareStatement(DELETE_PERSON);
			ps.setInt(1, id);
			
			ps.executeUpdate(); 
			ps.close();
			
			System.out.println("Person deleted....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	

}
