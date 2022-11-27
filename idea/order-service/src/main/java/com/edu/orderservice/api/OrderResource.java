package com.edu.orderservice.api;

import com.edu.orderservice.common.TransactionResponse;
import com.edu.orderservice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.edu.orderservice.common.TransactionRequest;
import com.edu.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderResource
{
	@Autowired
	private OrderService service;
	
//	@PostMapping("/bookOrder")
//	public Order bookOrder(@RequestBody Order order){
//		return service.saveOrder(order);
//	}
//	@PostMapping("/bookOrder")
//	public TransactionResponse bookOrder(@RequestBody TransactionRequest request)	{
//		return service.saveOrder(request);
//	}
}
