package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Cart;
import com.atcs.ecommerce.repo.CartRepo;
import com.atcs.ecommerce.service.CartService;

@Component
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepo cartRepo;
	
	@Override
	public List<Cart> getData() {
		
		return cartRepo.findAll();
	}
	@Override
	public Cart getDataById(int id) {
		
		return cartRepo.findById(id).get();
	}

	@Override
	public void postData(Cart car) {
		cartRepo.save(car);
	}

	@Override
	public void putData(Cart car) {
		cartRepo.save(car);
		
	}

	@Override
	public void deleteData(int id) {
		cartRepo.deleteById(id);
		
	}

}
