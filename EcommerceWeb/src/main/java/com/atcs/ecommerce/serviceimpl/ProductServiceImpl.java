package com.atcs.ecommerce.serviceimpl;

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


}
