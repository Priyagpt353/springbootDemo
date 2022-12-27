package com.nagarro.exitAssignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.exitAssignment.model.*;

@Repository
public interface ServiceabilityRepository extends JpaRepository<PinCode,Integer> {	
	PinCode findByPincode(String pincode);
	

}
