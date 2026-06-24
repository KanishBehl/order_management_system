package com.example.ordermanagement.repository;

import com.example.ordermanagement.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class OrderRepository {
    private final Map<String, Order> store = new ConcurrentHashMap<>();

    public List<Order> findAll() {
        return new ArrayList<>(store.values());
    }

    public Order findById(String id) {
        return store.get(id);
    }

    public Order save(Order order) {
        store.put(order.getId(), order);
        return order;
    }

    public Order update(String id, Order updatedOrder) {
        store.put(id, updatedOrder);
        return updatedOrder;
    }

    public boolean delete(String id) {
        return store.remove(id) != null;
    }
}
