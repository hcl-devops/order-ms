package com.order.details.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OrderCreateRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date deliveryDate;
	private List<OrderLineCreateReq> orderLine = new ArrayList<>();

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public List<OrderLineCreateReq> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(List<OrderLineCreateReq> orderLine) {
		this.orderLine = orderLine;
	}
}
