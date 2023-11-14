package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.Service;

@RestController
public class CustomerController {
	@Autowired
	private Service service;
	
	@PostMapping("/placeOrder")
	public Order addOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	@GetMapping("/getOrders")
	public List<Order> getOrder() {
		return service.getOrders();
	}
}
