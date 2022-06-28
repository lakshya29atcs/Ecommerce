package com.atcs.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.ecommerce.entity.OrderItem;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem,Integer>{
	
}
