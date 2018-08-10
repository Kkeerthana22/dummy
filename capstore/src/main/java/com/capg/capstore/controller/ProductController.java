package com.capg.capstore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.capstore.bean.Product;
import com.capg.capstore.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/getproducts")
	public Optional<Product> getProduct(@RequestParam String id){
		 return service.getProductById(Integer.parseInt(id));	 
		 	 }
	
}
