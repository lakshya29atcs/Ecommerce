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

import com.atcs.ecommerce.entity.OrderItem;
import com.atcs.ecommerce.service.OrderItemService;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
	
	@Autowired
	OrderItemService orderItemService;
	@GetMapping("/")
	public List<OrderItem> getAll(){
		return orderItemService.getAll();
	}
	
	@GetMapping("/{id}")
	public OrderItem getById(@PathVariable("id") int id) {
		return orderItemService.getById(id);
	}
	
	@PostMapping("/")
	public void post(@RequestBody OrderItem or) {
		orderItemService.post(or);
	}
	@PutMapping("/")
	public void put(@RequestBody OrderItem or) {
		orderItemService.put(or);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		orderItemService.delete(id);
	}
}
