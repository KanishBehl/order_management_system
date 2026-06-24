package com.example.ordermanagement.service;

import com.example.ordermanagement.model.Order;
import com.example.ordermanagement.model.OrderStatus;
import com.example.ordermanagement.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        Order order = orderRepository.findById(id);
        if (order == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        return order;
    }

    public Order createOrder(Order order) {
        order.setId(UUID.randomUUID().toString());
        order.setStatus(order.getStatus() != null ? order.getStatus() : OrderStatus.PENDING);
        order.setCreatedAt(Instant.now());
        order.setUpdatedAt(order.getCreatedAt());
        return orderRepository.save(order);
    }

    public Order updateOrder(String id, Order updatedOrder) {
        if (orderRepository.findById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
        updatedOrder.setId(id);
        updatedOrder.setUpdatedAt(Instant.now());
        return orderRepository.update(id, updatedOrder);
    }

    public void deleteOrder(String id) {
        if (!orderRepository.delete(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Order not found");
        }
    }
}
