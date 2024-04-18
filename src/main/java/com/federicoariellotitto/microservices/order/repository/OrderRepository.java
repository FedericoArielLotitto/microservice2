package com.federicoariellotitto.microservices.order.repository;

import com.federicoariellotitto.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
