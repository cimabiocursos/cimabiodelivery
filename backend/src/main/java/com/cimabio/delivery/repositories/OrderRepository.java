package com.cimabio.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cimabio.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
