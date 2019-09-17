package com.test.ProductApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.ProductApp.beans.Product;
import com.test.ProductApp.exception.ProductException;
import com.test.ProductApp.service.ProductAppService;

@RestController
public class ProductAppController {

	@Autowired
	ProductAppService productService;
	
	@RequestMapping("/products")
	public List<Product> getProducts() throws ProductException {
		return productService.getProducts();
	}
	
	@PostMapping("/products")
	public List<Product> addProduct(@RequestBody Product prod) throws ProductException {
		return productService.addProduct(prod);
	}
	
	@DeleteMapping("/products/{id}")
	public List<Product> deleteProduct(@PathVariable int id) throws ProductException {
		return productService.deleteProduct(id);
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) throws ProductException {
		return productService.getProductById(id);
	}
	
	@PutMapping("/products/update")
	public List<Product> updateProduct(@RequestBody Product prod) throws ProductException {
		return productService.updateProduct(prod);
	}
	
	@GetMapping("/products/category")
	public List<Product> getProductsByCategory(@RequestParam String category) throws ProductException {
		return productService.getProductsByCategory(category);
	}
}
