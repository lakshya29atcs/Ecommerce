package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.atcs.ecommerce.entity.User;


@Service
public interface UserService {

	public List<User> getAllUser();
	
	public User findUserById(int id);
	
	public void postData(User user);
	
	public void putData(User user);
	
	public void deleteUserById(int id);
}
