package labWork.hibernateLabs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp2 {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		BookAuthor auth = new BookAuthor();
		auth.setName("Ben");

		Book book = new Book();
		book.setTitle("Canterville Ghost");
		book.setPrice(500);

		auth.getBook().add(book);

		em.getTransaction().begin();
		em.persist(book);
		em.persist(auth);
		em.getTransaction().commit();
		System.out.println("Done");
	}
}