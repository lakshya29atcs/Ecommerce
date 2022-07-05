package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Product;

@Service
public interface ProductService  {

	public List<Product> getData();

	public void postData(Product pro);

	public void putData(Product pro);

	public void deleteData(int id);
	
	public Product getDataById(int id);
	
	public String getDetails(String name);
	
	public List<Product> getByPrice(double price);
	
	public List<Product> getByCategory(String category);
}
