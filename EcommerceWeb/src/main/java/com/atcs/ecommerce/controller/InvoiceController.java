package com.atcs.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.ecommerce.entity.Invoice;
import com.atcs.ecommerce.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;

	@GetMapping("/{id}")
	public Invoice getInvoice(@PathVariable("id") int orderid)
	{
		return invoiceService.getInvoice(orderid);
	}
}
