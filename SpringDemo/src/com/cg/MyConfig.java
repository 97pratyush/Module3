package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg")
public class MyConfig {

	@Bean
	public Customer customer() {
		Customer cust = new Customer();
		cust.setId(100);
		cust.setName("Alex");
		
		return cust;
	}
	
	@Bean
	public Customer cust() {
		Customer cust = new Customer();
		cust.setId(1001);
		cust.setName("Shivani");
		
		return cust;
	}
}
