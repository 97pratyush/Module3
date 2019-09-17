package com.test.ProductApp.service;

import java.util.List;

import com.test.ProductApp.beans.Product;
import com.test.ProductApp.exception.ProductException;

public interface ProductAppService {
	
	List<Product> getProducts() throws ProductException;
	List<Product> addProduct(Product prod) throws ProductException;
	List<Product> deleteProduct(int id) throws ProductException;
	List<Product> updateProduct(Product prod) throws ProductException;
	Product getProductById(int id) throws ProductException;
	List<Product> getProductsByCategory(String category) throws ProductException;
}
