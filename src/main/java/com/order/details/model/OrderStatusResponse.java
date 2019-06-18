package com.order.details.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * order status response
 */

public class OrderStatusResponse implements Serializable, CalculationResponse, Comparable<OrderStatusResponse> {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String orderNo;
	private String shipTo;
	private String billTo;
	private String deliveryDate;
	private double totalAmount;
	private List<OrderLineDto> orderLine = new ArrayList<>();

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getShipTo() {
		return shipTo;
	}

	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}

	public String getBillTo() {
		return billTo;
	}

	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public List<OrderLineDto> getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(List<OrderLineDto> orderLine) {
		this.orderLine = orderLine;
	}

	@Override
	public int compareTo(OrderStatusResponse o) {
		// TODO Auto-generated method stub
		return (this.id.compareTo(o.getId()));
	}
}
