package com.accenture.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Payment {
	@Autowired
	@Qualifier("javaOrderBean")
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ordering"+this.order.getItem() +"price"+this.order.getPrice();
	}
	

}
