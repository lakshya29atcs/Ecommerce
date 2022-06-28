package com.atcs.ecommerce.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	@Column
	private String imgUrl;
	@Column
	private double price;
	@Column
	private String description;
	@ManyToOne()
	private Category category;
	@OneToMany(mappedBy = "product")
	private List<Cart> cart;
	
	public Product(int id, String name, String imgurl, double price, String description, Category category,
			List<Cart> cart) {
		super();
		this.id = id;
		this.name = name;
		this.imgUrl = imgurl;
		this.price = price;
		this.description = description;
		this.category = category;
		this.cart = cart;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgurl() {
		return imgUrl;
	}
	public void setImgurl(String imgurl) {
		this.imgUrl = imgurl;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}


	
	

}
