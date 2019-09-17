package com.test.ProductApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.ProductApp.exception.ProductException;

public class ProductExceptionHandler {
	
	@ExceptionHandler({ProductException.class})
	public ResponseEntity<String> exceptionHandler(Exception e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
	}

}
