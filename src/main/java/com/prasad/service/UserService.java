package com.prasad.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasad.dau.UserRepository;
import com.prasad.model.User;

@Service
public class UserService 
{
	@Autowired 
	private UserRepository userRepository;
	
	public String createUser(User user)
	{
		System.out.println("---------------Started------------");
		this.userRepository.save(user);
		return "User registered successfully";
	}
	
	public List<User> getAllUser()
	{
		
		return this.userRepository.findAll();
	}
	
	public User getByUsername(String username)
	{
		
		return this.userRepository.findByUsername(username);
	}
}
