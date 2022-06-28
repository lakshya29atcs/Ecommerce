package com.atcs.ecommerce.entity;

import java.util.Date;
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
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private Date createdDate;
	@Column
	private int quantity;
	@ManyToOne
	private Product product;
	@OneToMany(mappedBy = "cart")
	private List<User> user;
	
	public Cart(int id, Date createddate, int quantity, Product product, List<User> user) {
		super();
		this.id = id;
		this.createdDate = createddate;
		this.quantity = quantity;
		this.product = product;
		this.user = user;
	}
	public Cart() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateddate() {
		return createdDate;
	}
	public void setCreateddate(Date createddate) {
		this.createdDate = createddate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}

	

}
