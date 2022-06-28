package com.atcs.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.ecommerce.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>{

}
