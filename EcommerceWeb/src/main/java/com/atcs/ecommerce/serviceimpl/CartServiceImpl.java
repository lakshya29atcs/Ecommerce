package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Cart;
import com.atcs.ecommerce.repo.CartRepo;
import com.atcs.ecommerce.repo.OrderRepo;
import com.atcs.ecommerce.repo.UserRepo;
import com.atcs.ecommerce.service.CartService;

@Component
public class CartServiceImpl implements CartService{

	
	public final CartRepo cartRepo;
	
	public final OrderRepo orderRepo;
	
	public final UserRepo userRepo;
	
	
	
	public CartServiceImpl(CartRepo cartRepo, OrderRepo orderRepo, UserRepo userRepo) {
		super();
		this.cartRepo = cartRepo;
		this.orderRepo = orderRepo;
		this.userRepo = userRepo;
	}
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
	@Override
	public void addToCart(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeToCart(int id) {
		// TODO Auto-generated method stub
		
	}

}
