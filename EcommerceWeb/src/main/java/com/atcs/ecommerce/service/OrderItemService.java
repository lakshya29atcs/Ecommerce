package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.OrderItem;

@Service
public interface OrderItemService {
	public void post(OrderItem or);
	public void put(OrderItem or);
	public OrderItem getById(int id);
	public List<OrderItem> getAll();
	public void delete(int id);
	
}
