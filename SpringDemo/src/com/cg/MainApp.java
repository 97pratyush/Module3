package com.cg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		
		Triangle triangle = (Triangle) context.getBean("triangle"); triangle.draw();
		 
		 
		/*
		 * Circle circle = (Circle) context.getBean("circle"); circle.draw();
		 */ 
		 
	}

}
