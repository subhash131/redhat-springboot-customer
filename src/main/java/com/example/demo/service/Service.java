package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

public class Service {
	private OrderRepository repository;
	
	public Order saveOrder(Order order) {
		return repository.saveAndFlush(order);
	}
	public List<Order> saveOrders(List<Order> orders) {
		return repository.saveAll(orders);
	}
	
	public List<Order> getOrders(){
		return repository.findAll();
	}
}
