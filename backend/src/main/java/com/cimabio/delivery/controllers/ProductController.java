package com.cimabio.delivery.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cimabio.delivery.dto.ProductDTO;
import com.cimabio.delivery.services.ProductService;

@RestController
@RequestMapping(value = "products")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping(value = "/listartodosporordemdenome")
	public ResponseEntity<List<ProductDTO>> findAllByOrderByNameAsc(){
		List<ProductDTO> list = productservice.findAllByOrderByNameAsc();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/listartodos")
	public ResponseEntity<List<ProductDTO>> findAll(){
		List<ProductDTO> list = productservice.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
