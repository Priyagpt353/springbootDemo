package com.nagarro.exitAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.nagarro.exitAssignment.model.PinCode;
import com.nagarro.exitAssignment.model.Product;
import com.nagarro.exitAssignment.repository.ServiceabilityRepository;

@Service
public class ServiceabilityService {
	
	@Autowired
	private ServiceabilityRepository repo;
	
	public PinCode addPincoode(PinCode pin) {
		return repo.save(pin);
	}
	
	public List<PinCode> getPincodes(){
		return repo.findAll();
	}
	
	public PinCode getDeliveryTime(String pincode) {
		PinCode pc = repo.findByPincode(pincode);
		if(pc == null) {
			return null;
		}
		PinCode code = new PinCode();
		code.setPincode(pc.getPincode());
		code.setDays(pc.getDays());
		return code;
	}
	
	
	
	
	

}
