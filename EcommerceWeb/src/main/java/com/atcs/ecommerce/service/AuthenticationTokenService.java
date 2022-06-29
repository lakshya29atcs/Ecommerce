package com.atcs.ecommerce.service;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.AuthenticationToken;
import com.atcs.ecommerce.entity.User;

@Service
public interface AuthenticationTokenService  {

	public AuthenticationToken getToken(User user);
	public void postToken(AuthenticationToken auth);
	
	
	
	
}
