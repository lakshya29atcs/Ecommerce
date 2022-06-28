package com.atcs.ecommerce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.ecommerce.entity.Wallet;
import com.atcs.ecommerce.repo.WalletRepo;
import com.atcs.ecommerce.service.WalletService;

@Component
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	WalletRepo walletRepo;

	@Override
	public List<Wallet> getData() {
		return walletRepo.findAll();
	}

	@Override
	public void postData(Wallet wallet) {
		walletRepo.save(wallet);
	}

	@Override
	public void putData(Wallet wallet) {
		walletRepo.save(wallet);
	}

	@Override
	public void deleteData(int id) {
		walletRepo.deleteById(id);
	}

	@Override
	public Wallet getDatabyId(int id) {
		return walletRepo.findById(id).get();
	}

}
