package com.cg;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Details_Day2_MainApp {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		/*
		 * //Code to fetch data using query Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter gender : "); String gender = sc.nextLine();
		 * 
		 * TypedQuery<Employee> query =
		 * em.createQuery("from Employee where gender=:gen", Employee.class);
		 * query.setParameter("gen", gender);
		 * 
		 * List<Employee> employees = query.getResultList();
		 * 
		 * for (Employee employee : employees) { System.out.println(employee); }
		 */

		// Code to delete row from table
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter employee id : "); int empId = sc.nextInt();
		 * 
		 * // Using Query interface Query query =
		 * em.createQuery("delete from Employee where id=:eno");
		 * query.setParameter("eno", empId); em.getTransaction().begin(); int result =
		 * query.executeUpdate(); // Use Employee emp = query.getSingleResult() for
		 * TypedQuery and remove transaction.. em.getTransaction().commit();
		 * System.out.println(result + " row(s) deleted!");
		 */
		
		
		
		
		//Code to update table rows using conditions
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter gender : ");
		 * String gender = sc.nextLine(); System.out.println("Enter salary : "); float
		 * sal = sc.nextFloat(); System.out.println("Enter age : "); int age =
		 * sc.nextInt();
		 * 
		 * Query query = em.
		 * createQuery("update Employee set salary=salary+:sal,age=age+:age where gender=:gender"
		 * ); query.setParameter("sal", sal); query.setParameter("age", age);
		 * query.setParameter("gender", gender); em.getTransaction().begin(); int result
		 * = query.executeUpdate(); em.getTransaction().commit();
		 * System.out.println(result + " row(s) updated");
		 */
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		TypedQuery<Employee> query = em.createNamedQuery("getAllEmployees", Employee.class);
		
		List<Employee> employees = query.getResultList();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		System.out.println("------------------------------------------------------------------------");
		
		query = em.createNamedQuery("getEmployeeByGender", Employee.class);
		query.setParameter("gen", "Male");
		List<Employee> employeeGen = query.getResultList();
		
		for (Employee employee : employeeGen) {
			System.out.println(employee);
		}
		
		sc.close();
		em.close();
		factory.close();
	}
}
