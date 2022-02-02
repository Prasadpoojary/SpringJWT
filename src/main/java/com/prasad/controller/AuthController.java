package com.prasad.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.model.User;
import com.prasad.service.UserService;

@RestController
public class AuthController 
{
	@Autowired
	private UserService userService;


	
	@GetMapping("/say")
	public String sayHello()
	{
		return "{'name':'Prasad','company':'TCS','role':'developer'}";
	}
	
	@PostMapping("/create")
	@ResponseBody
	public String createUser(@RequestBody User user)
	{
		return this.userService.createUser(user);
	}


	
	@GetMapping("/users")
	public List<User> allUsers()
	{
		try {
			return this.userService.getAllUser();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable String username)
	{
		return this.userService.getByUsername(username);
	}
	
	
}
