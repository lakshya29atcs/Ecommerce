package com.atcs.ecommerce.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.ecommerce.entity.User;
import com.atcs.ecommerce.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public List<User> getAllusers()
	{
		return userService.getAllUser();
		
	}
	
	@GetMapping("/{id}")
	public User getUserId(@PathVariable("id") int id)
	{
		return userService.findUserById(id);
	}
	
	@PostMapping("/")
	public void postData(@RequestBody User user)
	{
		userService.postData(user);
	}
	 
	@PutMapping("/")
	public void updateData(@RequestBody User user)
	{
		userService.putData(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserId(@PathVariable("id") int id)
	{
		userService.deleteUserById(id);
	}
}
