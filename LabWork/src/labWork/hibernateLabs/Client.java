package labWork.hibernateLabs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Lab1_Author author = new Lab1_Author("Dan", "", "Brown", 10232323);
		
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		
		System.out.println("Added greet to database.");
		
		em.close();
		factory.close();
	}
}
