package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.OrderItem;
import com.atcs.ecommerce.repo.OrderItemRepo;
import com.atcs.ecommerce.service.OrderItemService;

@Component
public class OrderItemServiceImpl implements OrderItemService{

	@Autowired
	OrderItemRepo repo;
	
	@Override
	public void post(OrderItem or) {
		repo.save(or);
	}

	@Override
	public void put(OrderItem or) {
		repo.save(or);
	}

	@Override
	public OrderItem getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<OrderItem> getAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
	

}
