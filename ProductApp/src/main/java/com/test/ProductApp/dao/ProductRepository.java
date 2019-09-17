package com.test.ProductApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.ProductApp.beans.Product;
import com.test.ProductApp.exception.ProductException;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("from Product where category=:category")
	List<Product> getProductsByCategory(@Param("category") String category) throws ProductException;
}
