package com.nagarro.exitAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.exitAssignment.model.Product;
import com.nagarro.exitAssignment.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public Product addNewProduct(Product product) {
		return productRepo.save(product);
	}
	
	public List<Product> getProduct(){
		return productRepo.findAll();
	}
	
	public Optional<Product> findbyId(int id){
		return productRepo.findById(id);
	}

}
