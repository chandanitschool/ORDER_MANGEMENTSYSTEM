package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.OrderItemEntity;
import com.demo.exception.OrderNotFoundException;
import com.demo.model.OrderItem;
import com.demo.repository.OrderItemRepository;

@Service
public class OrderItemServImpl  implements OrderItemService{

	@Autowired
	private OrderItemRepository orderItemRepository;
	

	public String creatOrderItem(OrderItemEntity orderItem) {
	 	
		 OrderItemEntity save = orderItemRepository.save(orderItem);
		
		System.out.println("--order saved succesfully---"+save);
		
		return "order succesfully created";
		
		
		
	}


	@Override
	public OrderItem getOrderById(Integer id) {
		
		
		Optional<OrderItemEntity> getById = orderItemRepository.findById(id);
		
		if(getById.isPresent())
		{
			OrderItem  orderItem = new OrderItem(getById.get().getProductCode(), getById.get().getProductName(), 
					getById.get().getQuantity());
		
		return orderItem;
		
		}
		else 
		{
			throw new OrderNotFoundException("Order Not Found");
		}
		
		
		
	}


	

		
		
		
	}

