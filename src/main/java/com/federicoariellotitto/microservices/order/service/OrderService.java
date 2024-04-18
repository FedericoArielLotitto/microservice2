package com.federicoariellotitto.microservices.order.service;

import com.federicoariellotitto.microservices.order.dto.OrderRequest;
import com.federicoariellotitto.microservices.order.model.Order;
import com.federicoariellotitto.microservices.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(Order order) {

        orderRepository.save(order);
    }
}
