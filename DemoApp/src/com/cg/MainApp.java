package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		/*
		 * //Code to insert data in table 
		 * Employee emp = new Employee(104,"Mary","Female",28,34000);
		 * 
		 * em.getTransaction().begin(); 
		 * em.persist(emp);
		 * em.getTransaction().commit(); 
		 * System.out.println("Data saved");
		 */
		
		
		//Code to find data from table
		/*
		 * em.getTransaction().begin(); 
		 * Employee emp = em.find(Employee.class, 101);
		 * System.out.println(emp); 
		 * // emp.setSalary(79000); 
		 * em.remove(emp);
		 * em.getTransaction().commit(); 
		 * System.out.println("After commit\n" + emp);
		 */
		
		
		/*// Code to see detach and clear method
		 * // Employee emp = new Employee(101,"Alex","Male",27,55000);
		 * em.getTransaction().begin(); 
		 * Employee e = em.find(Employee.class, 103);
		 * Employee e1 = em.find(Employee.class, 104); 
		 * System.out.println(e);
		 * em.detach(e); //This will not detach value of e from database. Hence, table
		 * value in db will not change 
		 * e.setAge(30); e1.setAge(40); 
		 * // em.merge(e); //This will change the value in database even after detach | Used for updating 
		 * em.clear(); //Removes all entities from persistence context 
		 * e.setAge(50);
		 * e1.setAge(50); 
		 * em.getTransaction().commit();
		 * System.out.println("After commit \n" + e); //Will show new value here in console after detach & no merge, but it'll not change in database
		 */		
		
		
		//Code for automatic id initialization
		Employee emp = new Employee();
		emp.setName("Arun");
		emp.setGender("Male");
		emp.setAge(31);
		emp.setSalary(42000);
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("After commit\n" + emp);
		
		em.close();
		factory.close();
	}
}
