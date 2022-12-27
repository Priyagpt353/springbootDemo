package com.nagarro.exitAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.exitAssignment.repository.SearchProductRepository;
import com.nagarro.exitAssignment.model.Product;

@Service
public class SearchProductService {
	
	@Autowired
	private SearchProductRepository repo;
	
	public List<Product> getByName(String p_name){
		return repo.findbyName(p_name);
	}
	
	public List<Product> getByBrand(String p_brand){
		return repo.findbyBrand(p_brand);
	}
	
	public List<Product> getProductListBySearch(String search)
	{
		return repo.findBySearch(search);
	}

}
