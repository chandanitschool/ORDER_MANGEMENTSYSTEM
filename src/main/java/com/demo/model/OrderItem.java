

package com.demo.model;


public class OrderItem {
	
		private Integer productCode;
		
		private String productName;
		
		private Integer quantity;
		
		
		

		public OrderItem(Integer productCode, String productName, Integer quantity) {
			super();
			this.productCode = productCode;
			this.productName = productName;
			this.quantity = quantity;
		}

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
