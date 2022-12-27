package com.nagarro.exitAssignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.exitAssignment.model.Product;

@Repository
public interface SearchProductRepository extends JpaRepository<Product,Integer> {
	
	@Query("select p from Product p where p.p_name=:p_name")
	public List<Product> findbyName(@Param("p_name") String p_name);
	
	@Query("select p from Product p where p.p_brand=:p_brand")
	public List<Product> findbyBrand(@Param("p_brand") String p_brand);
	
	@Query("SELECT p from Product p Where INSTR(Concat(p.p_code,p.p_name,p.p_brand),:search)>0 or INSTR(Concat(p.p_code,p.p_brand,p.p_name),:search)>0 or INSTR(Concat(p.p_name,p.p_code,p.p_brand),:search)>0 or INSTR(Concat(p.p_name,p.p_brand,p.p_code),:search)>0 or INSTR(Concat(p.p_brand,p.p_code,p.p_name),:search)>0 or INSTR(Concat(p.p_brand,p.p_name,p.p_code),:search)>0 ")
    public List<Product> findBySearch(@Param("search")String search);


}
