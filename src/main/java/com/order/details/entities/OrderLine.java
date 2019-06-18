package com.order.details.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author semwaln
 * 
 *         Entity class for ORDER_LINE TABLE.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ORDER_LINE")
public class OrderLine implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "REQ_SHIP_DATE")
	private Date reqShipDate;

	@Column(name = "STATUS_DATE")
	private Date statusDate;

	@Column(name = "UNIT_PRICE")
	private double unitPrice;

	@Column(name = "TAX")
	private double tax;

	@Column(name = "RETAIL_PRICE")
	private double retailPrice;

	@Column(name = "ORDERED_QTY")
	private int ordereQty;

	@Column(name = "PRIME_LINE_NO")
	private int primeLineNo;

	@Column(name = "ORIGINAL_ORDERED_QTY")
	private int originalOrderedQty;

	@Column(name = "ORDER_NO")
	private String orderNo;

	@Column(name = "IMAGE_URL")
	private String imageUrl;

	@Column(name = "SELLER_ORGANIZATION_CODE")
	private String sellerOrganizationCode;

	@Column(name = "ORDER_TYPE")
	private String orderType;

	@Column(name = "ITEM_KEY")
	private int itemKey;

	@Column(name = "ITEM_ID")
	private String itemId;

	@Column(name = "UOM")
	private String uom;

	@Column(name = "MERGE_NODE")
	private String mergeNode;

	@Column(name = "SHIPNODE_KEY")
	private String shipnodeKey;

	@Column(name = "STATUS")
	private String status;

	/*
	 * @ManyToOne(fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "ORDER_NO", nullable = false)
	 * 
	 * @OnDelete(action = OnDeleteAction.CASCADE) // @Column(name = "ORDER_NO")
	 * private OrderData orderData;
	 */

	public Integer getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getReqShipDate() {
		return reqShipDate;
	}

	public void setReqShipDate(Date reqShipDate) {
		this.reqShipDate = reqShipDate;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
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

	/*
	 * public String getOrderNo() { return orderNo; }
	 * 
	 * public void setOrderNo(String orderNo) { this.orderNo = orderNo; }
	 */

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

	public int getItemKey() {
		return itemKey;
	}

	public void setItemKey(int itemKey) {
		this.itemKey = itemKey;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/*
	 * public OrderData getOrderData() { return orderData; }
	 * 
	 * public void setOrderData(OrderData orderData) { this.orderData = orderData; }
	 */

}