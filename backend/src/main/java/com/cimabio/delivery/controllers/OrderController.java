package com.cimabio.delivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cimabio.delivery.dto.OrderDTO;
import com.cimabio.delivery.services.OrderService;

@RestController
@RequestMapping(value = "orders")
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@GetMapping(value = "/listadeordens")
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = orderservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/listadeordensporchamados")
	public ResponseEntity<List<OrderDTO>> findOrdersWithProducts(){
		List<OrderDTO> list = orderservice.findOrdersWithProducts();
		return ResponseEntity.ok().body(list);
	}
	
}
