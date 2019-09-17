package com.test.ProductApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ProductApp.beans.Product;
import com.test.ProductApp.dao.ProductRepository;
import com.test.ProductApp.exception.ProductException;

@Service
public class ProductAppServiceImpl implements ProductAppService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProducts() throws ProductException {
		return productRepository.findAll();
	}

	@Override
	public List<Product> addProduct(Product prod) throws ProductException {
		if (productRepository.existsById(prod.getId()))
			throw new ProductException("Already exists.");
		else if (prod.getQuantity() <= 0) {
			throw new ProductException("Quantity cannot be less than zero");
		}

		// Handled using spring @pattern annotation
		/*
		 * else if(!(prod.getCategory().equals("Laptop") ||
		 * prod.getCategory().equals("Mobile") || prod.getCategory().equals("TV"))) {
		 * throw new ProductException("Invalid Category"); }
		 */
		productRepository.save(prod);
		return getProducts();

	}

	@Override
	public List<Product> deleteProduct(int id) throws ProductException {
		productRepository.deleteById(id);
		return getProducts();
	}

	@Override
	public List<Product> updateProduct(Product prod) throws ProductException {
		if (!productRepository.existsById(prod.getId())) {
			throw new ProductException("This id doesn't exist.");
		} else {
			Product temP = getProductById(prod.getId());
			temP.setPrice(prod.getPrice());
			temP.setQuantity(prod.getQuantity());
			productRepository.save(temP);
			return getProducts();
		}

	}

	@Override
	public Product getProductById(int id) throws ProductException {
		if (!productRepository.existsById(id))
			throw new ProductException("Doesn't exists.");

		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> getProductsByCategory(String category) throws ProductException {
		return productRepository.getProductsByCategory(category);
	}
}
