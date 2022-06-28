package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Category;

@Service
public interface CategoryService {
	

	public List<Category> getData();
	public void postData(Category category);
	public void putData(Category category);
	public void deleteData(int id);
	public Category getbyId(int id);
	
}
