package com.test.ProductApp.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class Product {

	@Id
    @SequenceGenerator(name = "prodIdGen", sequenceName = "prodId", initialValue = 5001, allocationSize = 1)
    @GeneratedValue(generator = "prodIdGen", strategy = GenerationType.SEQUENCE)
    private int id;
	private String name;
	@Pattern(regexp = "(Mobile|TV|Laptop)", message = "Category should be TV, Mobile or Laptop only")
	private String category;
	@Min(1)
	private int quantity;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
