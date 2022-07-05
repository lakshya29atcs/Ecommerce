package com.atcs.ecommerce.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Product;
import com.atcs.ecommerce.repo.ProductRepo;
import com.atcs.ecommerce.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Product> getData() {
		return productRepo.findAll();
	}
	
	@Override
	public void postData(Product pro) {
		productRepo.save(pro);
	}
	@Override
	public void putData(Product pro) {
		productRepo.save(pro);
	}
	@Override
	public void deleteData(int id) {
		productRepo.deleteById(id);
	}

	@Override
	public Product getDataById(int id) {
		return productRepo.findById(id).get();
	}
	

	@Override
	public List<Product> getByPrice(double price) {
		List<Product> productNew = new ArrayList<Product>();
		List<Product> ls = productRepo.findAll();
		for(Product p: ls) {
			if(p.getPrice()==price) {
				productNew.add(p);
			}
		}
		return productNew;
	}

	@Override
	public List<Product> getByCategory(String category) {
		List<Product> productNew = new ArrayList<Product>();
		List<Product> ls = productRepo.findAll();
		for(Product p: ls) {
			if(p.getCategory().getCategory_name().equals(category)) {
				productNew.add(p);
			}
		}
		
		return productNew;
	}

	@Override
	public Product getDetails(String name) {
		List<Product> ls = productRepo.findAll();
		for(Product p: ls) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}


}
