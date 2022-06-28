package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Order;

@Service
public interface OrderService {
	public void post(Order or);
	public void put(Order or);
	public Order getById(int id);
	public List<Order> getAll();
	public void delete(int id);
}
