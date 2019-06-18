package com.order.details.model;

import java.io.Serializable;
import java.util.Date;

public class OrderLineDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String orderDate;
	private String reqShipDate;
	private String statusDate;
	private double unitPrice;
	private double tax;
	private double retailPrice;
	private int ordereQty;
	private int primeLineNo;
	private int originalOrderedQty;
	private String orderNo;
	private String sellerOrganizationCode;
	private String orderType;
	private String itemId;
	private int itemKey;
	private String uom;
	private String mergeNode;
	private String shipnodeKey;
	private String status;
	private String imageUrl;

	public int getItemKey() {
		return itemKey;
	}

	public void setItemKey(int itemKey) {
		this.itemKey = itemKey;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
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

	public int getPrimeLineNo() {
		return primeLineNo;
	}

	public void setPrimeLineNo(int primeLineNo) {
		this.primeLineNo = primeLineNo;
	}

	public int getOriginalOrderedQty() {
		return originalOrderedQty;
	}

	public void setOriginalOrderedQty(int originalOrderedQty) {
		this.originalOrderedQty = originalOrderedQty;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSellerOrganizationCode() {
		return sellerOrganizationCode;
	}

	public void setSellerOrganizationCode(String sellerOrganizationCode) {
		this.sellerOrganizationCode = sellerOrganizationCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getMergeNode() {
		return mergeNode;
	}

	public void setMergeNode(String mergeNode) {
		this.mergeNode = mergeNode;
	}

	public String getShipnodeKey() {
		return shipnodeKey;
	}

	public void setShipnodeKey(String shipnodeKey) {
		this.shipnodeKey = shipnodeKey;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
