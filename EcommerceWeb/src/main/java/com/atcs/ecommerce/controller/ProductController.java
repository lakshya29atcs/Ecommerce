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

import com.atcs.ecommerce.entity.Product;
import com.atcs.ecommerce.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService prodsvc;
	
	@GetMapping("/")
	public List<Product> getData(){
		return prodsvc.getData();
	}
	@GetMapping("/{id}")
	public Product getDataById(@PathVariable("id") int id){
		return prodsvc.getDataById(id);
	}
	@PostMapping("/")
	public void postData(@RequestBody Product pro) {
		prodsvc.postData(pro);
	}
	@PutMapping("/")
	public void putData(@RequestBody Product pro) {
		prodsvc.postData(pro);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int id){
		prodsvc.deleteData(id);
	}
	@GetMapping("/price/{price}")
	public List<Product> getByPrice(@PathVariable("price") double price){
		return prodsvc.getByPrice(price);
	}
	@GetMapping("/name/{name}")
	public Product getByName(@PathVariable("name") String name){
		return prodsvc.getDetails(name);
	}
	@GetMapping("/category/{category_name}")
	public List<Product> getByCategory(@PathVariable("category_name") String category){
		return prodsvc.getByCategory(category);
	}
	
}
