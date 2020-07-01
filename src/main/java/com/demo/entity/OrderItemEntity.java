package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_ITEM")
public class OrderItemEntity {
	
	@Id
	@Column(name="PRCT_CODE")
	private Integer productCode;
	
	@Column(name="PRCT_NAME")
	private String productName;
	@Column(name="QUANTITY")
	private Integer quantity;
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
