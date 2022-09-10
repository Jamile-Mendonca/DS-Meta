package com.devsuperior.DsMeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.DsMeta.entities.Sale;
import com.devsuperior.DsMeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	private SaleService service;
	
	@GetMapping
	public Page<Sale> findSales(Pageable pageable) {
	return service.findSales(pageable);
}
}
