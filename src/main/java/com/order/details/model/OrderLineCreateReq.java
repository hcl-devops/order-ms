package com.order.details.model;

import java.io.Serializable;
import java.util.Date;

public class OrderLineCreateReq implements Serializable {

	private static final long serialVersionUID = 1L;

	private String reqShipDate;
	private String statusDate;
	private double retailPrice;
	private int ordereQty;
	private String itemId;
	private String imageUrl;

	public String getReqShipDate() {
		return reqShipDate;
	}

	public void setReqShipDate(String reqShipDate) {
		this.reqShipDate = reqShipDate;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getOrdereQty() {
		return ordereQty;
	}

	public void setOrdereQty(int ordereQty) {
		this.ordereQty = ordereQty;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
