package com.example.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws.entity.OrderEntity;
import com.example.aws.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
private OrderRepository orderRepository;
	@PostMapping("/save")
	public OrderEntity add(@RequestBody OrderEntity order) {
		return orderRepository.save(order);
		
	}
	@GetMapping("/get")
	public List<OrderEntity> getAllOrdered(){
		return orderRepository.findAll();
		
	}
}
