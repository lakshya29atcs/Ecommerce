package com.atcs.ecommerce.entity;

import java.util.List;
import java.util.UUID;


public class Invoice {

	
	private List<OrderItem> orderItem;
	
	private UUID invoice_id = UUID.randomUUID();
	
	private double totalPrice;
	
	private Address address;

	public Invoice(List<OrderItem> orderItem,  double totalPrice, Address address) {
		super();
		this.orderItem = orderItem;

		this.totalPrice = totalPrice;
		this.address = address;
	}

	public Invoice(List<OrderItem> orderItem, double totalPrice) {
		super();
		this.orderItem = orderItem;
		this.totalPrice = totalPrice;
	}

	public Invoice() {
		super();
		
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public UUID getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(UUID invoice_id) {
		this.invoice_id = invoice_id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
	
}
