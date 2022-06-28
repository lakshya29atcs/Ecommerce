package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Category;
import com.atcs.ecommerce.repo.CategoryRepo;
import com.atcs.ecommerce.service.CategoryService;


@Component
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepo categoryRepo;

	@Override
	public List<Category> getData() {
		return categoryRepo.findAll();
	}

	@Override
	public void postData(Category category) {
		categoryRepo.save(category);
	}

	@Override
	public void putData(Category category) {
		categoryRepo.save(category);
	}

	@Override
	public void deleteData(int id) {
		categoryRepo.deleteById(id);
	}

	@Override
	public Category getbyId(int id) {
		return categoryRepo.findById(id).get();
	}

}
