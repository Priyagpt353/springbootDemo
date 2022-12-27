package com.nagarro.exitAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.exitAssignment.model.User;
import com.nagarro.exitAssignment.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String emailId) {
		return repo.findByEmailId(emailId);
	}
	
	public Long countAllRegistrated()
	{
		return repo.count();
	}
	
	public List<User> getUserDetail(){
		return repo.findAll();
	}

}
