package com.atcs.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.ecommerce.entity.Wallet;
import com.atcs.ecommerce.service.WalletService;

@RestController
@RequestMapping("/wallet")
public class WalletController {
	
	@Autowired
	WalletService walletService;
	
	@GetMapping("/")
	public List<Wallet> getData(){
		return walletService.getData();
	}
	
	@GetMapping("/{id}")
	public Wallet getbyId(@PathVariable("id") int id) {
		return walletService.getDatabyId(id);
	}
	
	@PostMapping("/")
	public void postData(@RequestBody Wallet wlt) {
		walletService.postData(wlt);
	}
	
	@PutMapping("/")
	public void putData(@RequestBody Wallet wlt) {
		walletService.putData(wlt);
	}
	
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable("id") int id) {
		walletService.deleteData(id);
	}
}
