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

import com.atcs.ecommerce.entity.Order;
import com.atcs.ecommerce.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/")
	public List<Order> getAll(){
		return orderService.getAll();
	}
	
	@GetMapping("/{id}")
	public Order getById(@PathVariable("id") int id) {
		return orderService.getById(id);
	}
	
	@PostMapping("/")
	public void post(@RequestBody Order or) {
		orderService.post(or);
	}
	@PutMapping("/")
	public void put(@RequestBody Order or) {
		orderService.put(or);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		orderService.delete(id);
	}
	
}
