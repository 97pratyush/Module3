package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

		@SuppressWarnings("resource")
	 	public static void main(String[] args) {
		
		/*
		 * AbstractApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); context.registerShutdownHook();
		 */
		
		
		/*
		 * Triangle triangle = (Triangle) context.getBean("triangle"); triangle.draw();
		 */
		 
		/*
		 * Circle circle = (Circle) context.getBean("circle"); circle.draw();
		 */
		
		/*
		 * Employee emp = context.getBean("employee", Employee.class);
		 * System.out.println(emp.getDob());
		 */
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Customer cust = context.getBean("customer",Customer.class);
		Customer cust1 = context.getBean("cust",Customer.class);
		Circle c = context.getBean("circle", Circle.class);
		c.draw();
		
		System.out.println(cust);
		System.out.println(cust1);
		
	}

}
