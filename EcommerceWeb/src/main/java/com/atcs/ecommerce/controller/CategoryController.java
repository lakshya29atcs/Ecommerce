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

import com.atcs.ecommerce.entity.Category;
import com.atcs.ecommerce.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public List<Category> getData(){
		return categoryService.getData();
	}
	
	@PostMapping("/")
	public void postData(@RequestBody Category ctg){
		categoryService.postData(ctg);
	}
	
	@PutMapping("/")
	public void putData(@RequestBody Category ctg) {
		categoryService.putData(ctg);
	}
	
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable("id") int id) {
		categoryService.deleteData(id);
	}
	
	@GetMapping("/{id}")
	public Category getbyId(@PathVariable("id") int id) {
		return categoryService.getbyId(id);
	}
}
