package _06.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session; //entity MAnager
import org.hibernate.SessionFactory;//entitymanagerfactory
import org.hibernate.Transaction;//transaction
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _06.hibernate.domain.Person;

				//JPA --> Hibernate
	// EntityManagerFactory ---> SessionFactory
	// EntityManager --> Session
	// Query --> Query
	// EntityTransaction --> Transaction


@Repository("personDAOImpl")
public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}
	
	
	
	
	
	@Override
	public void insert(Person person) {

/*		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();*/
		
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.persist(person);
		transaction.commit();
		
		session.close();
		
		System.out.println("Person inserted...");
		System.out.println(person);
	}

	@Override
	public Person getPersonById(int id) {
		Session session = getSession();
		Person person = session.get(Person.class, id);
		return person;
	}

	@Override
	public List getAllPersons() {

		//TypedQuery<Person> query = entityManager.createQuery("Select e from Person e", Person.class);
		Session session = getSession();
		Query query = session.createQuery("Select e from Person e");
		return query.list(); //return type list oldugundan personDAO List<Person> ->> List e çevirdik
	}
	@Override
	public void update(Person person) {

		/*entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();*/
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.update(person);  // session.persist(person); ayný ifade
		transaction.commit();
		
		session.close();
		
		System.out.println("Person updated...");
		System.out.println(person);
	}

	@Override
	public void delete(int id) {

		
		Person person = getPersonById(id);
		if(person != null) {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
		
			session.delete(person);
		
			transaction.commit();
		
			session.close();
		}
	}

}
