package com.cg;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Circle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
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

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name aware : " + beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory aware executed and value : " + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("ApplicationContext aware executed and value : " + context);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean after properties set!");
	}
	
	public void myInit() {
		System.out.println("My init method executed!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable bean destory method executed!");
	}
	
	public void tearDown() {
		System.out.println("tearDown method executed!");
	}
}
