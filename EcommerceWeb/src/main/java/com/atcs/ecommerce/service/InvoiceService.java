package com.atcs.ecommerce.service;

import org.springframework.stereotype.Service;

import com.atcs.ecommerce.entity.Invoice;

@Service
public interface InvoiceService {

	public Invoice getInvoice(int id);
}
