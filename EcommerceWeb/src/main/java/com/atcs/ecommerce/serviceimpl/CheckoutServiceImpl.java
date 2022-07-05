package com.atcs.ecommerce.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Cart;
import com.atcs.ecommerce.entity.Order;
import com.atcs.ecommerce.entity.OrderItem;
import com.atcs.ecommerce.entity.User;
import com.atcs.ecommerce.repo.CartRepo;
import com.atcs.ecommerce.repo.OrderRepo;
import com.atcs.ecommerce.repo.UserRepo;
import com.atcs.ecommerce.service.CheckoutService;

@Component
public class CheckoutServiceImpl implements CheckoutService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	CartRepo cartRepo;
	
	@Override
	public Order postCheck(int userid) {
		
		
		User user = userRepo.findById(userid).get();
	     Cart cart = user.getCart();	
	     List<OrderItem>  orderItem = cart.getOrderItem();
	     
	     //For empty cart items
	     cart.setOrderItem(new ArrayList<>());
	     cartRepo.save(cart);
	     double totalPrice=0;
	     for(OrderItem ot : orderItem)
	     {
	    	 
	    	 totalPrice += ot.getPrice()*ot.getQuantity();
	     }
	     System.out.println(totalPrice);
	     System.out.println(orderItem.toArray());
	     
	     Order order = new Order(totalPrice,orderItem,user);
	    return orderRepo.save(order);
	     
	     
	     
	    
	}

}
