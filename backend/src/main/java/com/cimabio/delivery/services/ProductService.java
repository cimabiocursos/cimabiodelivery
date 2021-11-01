package com.cimabio.delivery.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cimabio.delivery.dto.ProductDTO;
import com.cimabio.delivery.entities.Product;
import com.cimabio.delivery.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	
	@Transactional(readOnly = true)//Operação somente de leitura
	public List<ProductDTO> findAll(){
		List<Product> list = productrepository.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)//Operação somente de leitura
	public List<ProductDTO> findAllByOrderByNameAsc(){
		List<Product> list = productrepository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}
	
}
