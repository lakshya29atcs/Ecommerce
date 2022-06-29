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
import com.atcs.ecommerce.entity.Cart;
import com.atcs.ecommerce.service.CartService;
@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService cartsvc;
	
	@GetMapping("/")
	public List<Cart> getData(){
		return cartsvc.getData();
	}
	@GetMapping("/{id}")
	public Cart getDataById(@PathVariable("id") int id){
		return cartsvc.getDataById(id);
	}
	@PostMapping("/")
	public void postData(@RequestBody Cart cart) {
		cartsvc.postData(cart);
	}
	@PutMapping("/")
	public void putData(@RequestBody Cart cart) {
		cartsvc.postData(cart);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int id){
		cartsvc.deleteData(id);
	}
}
