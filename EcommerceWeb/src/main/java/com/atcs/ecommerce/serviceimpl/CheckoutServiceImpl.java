package com.atcs.ecommerce.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Cart;
import com.atcs.ecommerce.entity.Order;
import com.atcs.ecommerce.entity.OrderItem;
import com.atcs.ecommerce.entity.User;
import com.atcs.ecommerce.repo.OrderRepo;
import com.atcs.ecommerce.repo.UserRepo;
import com.atcs.ecommerce.service.CheckoutService;

@Component
public class CheckoutServiceImpl implements CheckoutService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public void postCheck(int id) {
		
		User user = userRepo.findById(id).get();
	     Cart cart = user.getCart();	
	     List<OrderItem>  orderItem = cart.getOrderItem();
	     double totalPrice=0;
	     for(OrderItem ot : orderItem)
	     {
	    	 totalPrice += ot.getPrice()*ot.getQuantity();
	     }
	     Order order = new Order(totalPrice,orderItem,user);
	     orderRepo.save(order);
	     
	     //For empty cart items
	     cart.setOrderItem(new ArrayList<>());
	}

}
