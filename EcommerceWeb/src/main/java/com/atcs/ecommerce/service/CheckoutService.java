package com.atcs.ecommerce.service;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Order;

@Service
public interface CheckoutService {

	public Order postCheck(int userid);
}
