package com.atcs.ecommerce.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String category_name;
	
	@Column
	private String description;
	
	@Column
	private String imageUrl;
	
	@OneToMany(mappedBy = "category")
	private List<Product> product;

	public Category() {	}

	public Category(int id, String category_name, String description, String imageUrl, List<Product> product) {
		super();
		this.id = id;
		this.category_name = category_name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@JsonManagedReference
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
}
