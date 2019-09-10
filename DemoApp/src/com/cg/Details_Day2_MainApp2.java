package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Details_Day2_MainApp2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		
		
		//Many to Many mapping code
//		Faculty fac = new Faculty();
//		fac.setName("Varsha");
//		
//		Technology tech1 = new Technology();
//		tech1.setTechnologyName("Java");
//		Technology tech2 = new Technology();
//		tech2.setTechnologyName("BDD");
//		
//		fac.getTechnologies().add(tech1);
//		fac.getTechnologies().add(tech2);
//		
//		tech1.getFaculties().add(fac);
//		tech2.getFaculties().add(fac);
//		
//		
//		em.getTransaction().begin();
//		em.persist(fac);
//		em.getTransaction().commit();
		
		
		
		
		
		
		
		//Not many to many, just basic
//		Faculty fac = em.find(Faculty.class, 1);
//		System.out.println(fac);
//		
//		for (Technology tech : fac.getTechnologies()) {
//			System.out.println(tech);
//		}
//		
		
		
		
		
		
		
		EmployeeNew emp = new EmployeeNew();
		emp.setName("Tanmay");
		TemporaryEmployee temp = new TemporaryEmployee();
		temp.setName("Shilpa");
		temp.setDailyWage(500);
		PermanentEmployee pemp = new PermanentEmployee();
		pemp.setName("Shivani");
		pemp.setAnnualSalary(56000);
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(temp);
		em.persist(pemp);
		em.getTransaction().commit();
		System.out.println("Done!");
		
		
		
		em.close();
		factory.close();
	}
}
