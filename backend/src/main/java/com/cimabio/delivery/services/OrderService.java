package com.cimabio.delivery.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cimabio.delivery.dto.OrderDTO;
import com.cimabio.delivery.entities.Order;
import com.cimabio.delivery.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderrepository;
	
	@Transactional(readOnly = true)//Operação somente de leitura
	public List<OrderDTO> findAll(){
		List<Order> list = orderrepository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)//Operação somente de leitura
	public List<OrderDTO> findOrdersWithProducts(){
		List<Order> list = orderrepository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
}
