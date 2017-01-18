package _05.jpa.example2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _05.jpa.example2.domain.Person;


@Repository("personDAOImpl")
public class PersonDAOImpl implements PersonDAO {

	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void insert(Person person) {

		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();

		System.out.println("Person inserted...");
		System.out.println(person);
	}

	@Override
	public Person getPersonById(int id) {
		return entityManager.find(Person.class, id);
	}

	@Override
	public List<Person> getAllPersons() {

		TypedQuery<Person> query = entityManager.createQuery("Select e from Person e", Person.class);

		return query.getResultList();
	}
	@Override
	public void update(Person person) {

		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.getTransaction().commit();

		System.out.println("Person updated...");
		System.out.println(person);
	}

	@Override
	public void delete(int id) {

		entityManager.getTransaction().begin();
		Person person = getPersonById(id);
		if (person != null) {
			entityManager.remove(person);
		}

		entityManager.getTransaction().commit();
	}

}
