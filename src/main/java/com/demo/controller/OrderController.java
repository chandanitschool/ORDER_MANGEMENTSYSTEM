package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.OrderItemEntity;
import com.demo.model.OrderItem;
import com.demo.service.OrderItemService;

@RestController
@RequestMapping("/createitem")
public class OrderController {
	
	String msg=null;
	@Autowired
	private OrderItemService orderItemService;
	@PostMapping("/save" )
	public @ResponseBody String  saveOrder(@RequestBody OrderItemEntity otem ) {
		System.out.println("==inside controller==");
		
	   msg= orderItemService.creatOrderItem(otem);
		
		
		return msg;
		
		
	}
	
	@GetMapping("/getorder/{id}")
	public @ResponseBody OrderItem getOrderItem(@ PathVariable int id){
		
		return orderItemService.getOrderById(id);
		
		
	}
	
	

}
