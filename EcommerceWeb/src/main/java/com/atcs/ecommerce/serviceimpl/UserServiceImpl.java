package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.User;
import com.atcs.ecommerce.repo.UserRepo;
import com.atcs.ecommerce.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> getAllUser() {
		
		return userRepo.findAll();
	}

	@Override
	public User findUserById(int id) {
		
		return userRepo.findById(id).get();
	}

	@Override
	public void postData(User user) {
	
		userRepo.save(user);
		
	}

	@Override
	public void putData(User user) {
		userRepo.save(user);
		
	}

	@Override
	public void deleteUserById(int id) {

		userRepo.deleteById(id);
		
	}

}
