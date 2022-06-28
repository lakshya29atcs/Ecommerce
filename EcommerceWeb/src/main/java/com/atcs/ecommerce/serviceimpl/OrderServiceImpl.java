package com.atcs.ecommerce.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Order;
import com.atcs.ecommerce.repo.OrderRepo;
import com.atcs.ecommerce.service.OrderService;

@Component
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo repo;
	
	@Override
	public void post(Order or) {
		repo.save(or);
		
	}

	@Override
	public void put(Order or) {
		repo.save(or);
		
	}

	@Override
	public Order getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Order> getAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
