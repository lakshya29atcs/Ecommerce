package com.atcs.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.ecommerce.entity.Cart;


@Repository
public interface CartRepo extends JpaRepository<Cart,Integer>{

}
