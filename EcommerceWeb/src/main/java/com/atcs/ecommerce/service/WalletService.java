package com.atcs.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Wallet;

@Service
public interface WalletService {
	
	public List<Wallet> getData();
	public void postData(Wallet wallet);
	public void putData(Wallet wallet);
	public void deleteData(int id);
	public Wallet getDatabyId(int id);
}
