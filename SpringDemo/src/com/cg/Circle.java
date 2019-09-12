package com.cg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle {
	
	@Autowired
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Circle points (" + center.getX() + ", " + center.getY() + ")");
	}

	@PostConstruct
	public void startUp() {
		System.out.println("Startup method executed");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executed!");
	}
}
