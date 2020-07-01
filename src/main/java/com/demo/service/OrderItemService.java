package com.demo.service;

import com.demo.entity.OrderItemEntity;
import com.demo.model.OrderItem;

public interface OrderItemService {
	
	public String creatOrderItem(OrderItemEntity otem);
	
	public OrderItem getOrderById(Integer id );
		
	}
