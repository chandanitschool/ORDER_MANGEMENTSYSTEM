package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.OrderItemEntity;


public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Serializable> {

}
