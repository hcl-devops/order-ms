package com.order.details.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author semwaln
 * 
 *         Entity class for Item_Data TABLE.
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ITEM_DATA")
public class ItemData implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "SHORT_DESCRIPTION")
	private String shortDescription;

	@Column(name = "ITEM_ID")
	private String itemId;

	@Column(name = "UOM")
	private String uom;

	@Column(name = "UNIT_PRICE")
	private double unitPrice;

	@Column(name = "UNIT_PRICE_UOM")
	private String unitPriceUom;

	@Column(name = "UNIT_HEIGHT")
	private Double unitHeight;

	@Column(name = "UNIT_HEIGHT_UOM")
	private String unitHeightUom;

	@Column(name = "UNIT_LENGTH")
	private Double unitLength;

	@Column(name = "UNIT_LENGTH_UOM")
	private String unitLengthUom;

	@Column(name = "UNIT_WEIGHT")
	private Double unitWeight;

	@Column(name = "UNIT_WEIGHT_UOM")
	private String unitWeightUom;

	@Column(name = "UNIT_WIDTH")
	private Double unitWidth;

	@Column(name = "UNIT_WIDTH_UOM")
	private String unitWidthUom;

	@Column(name = "EXTN_TRANSPORT_METHOD_TYPE")
	private String extnTransportMethodType;

	@Column(name = "EXTN_IS_PARCEL_COMBINATION")
	private Integer extnIsParcelCombination;

	@Column(name = "ORGANIZATION_CODE")
	private String organizationCode;

	@Column(name = "ITEM_PICTURE")
	private String itemPicture;

	@Column(name = "UNIT_SALE_PRICE")
	private Double unitSalePrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitPriceUom() {
		return unitPriceUom;
	}

	public void setUnitPriceUom(String unitPriceUom) {
		this.unitPriceUom = unitPriceUom;
	}

	public Double getUnitHeight() {
		return unitHeight;
	}

	public void setUnitHeight(Double unitHeight) {
		this.unitHeight = unitHeight;
	}

	public String getUnitHeightUom() {
		return unitHeightUom;
	}

	public void setUnitHeightUom(String unitHeightUom) {
		this.unitHeightUom = unitHeightUom;
	}

	public Double getUnitLength() {
		return unitLength;
	}

	public void setUnitLength(Double unitLength) {
		this.unitLength = unitLength;
	}

	public String getUnitLengthUom() {
		return unitLengthUom;
	}

	public void setUnitLengthUom(String unitLengthUom) {
		this.unitLengthUom = unitLengthUom;
	}

	public Double getUnitWeight() {
		return unitWeight;
	}

	public void setUnitWeight(Double unitWeight) {
		this.unitWeight = unitWeight;
	}

	public String getUnitWeightUom() {
		return unitWeightUom;
	}

	public void setUnitWeightUom(String unitWeightUom) {
		this.unitWeightUom = unitWeightUom;
	}

	public Double getUnitWidth() {
		return unitWidth;
	}

	public void setUnitWidth(Double unitWidth) {
		this.unitWidth = unitWidth;
	}

	public String getUnitWidthUom() {
		return unitWidthUom;
	}

	public void setUnitWidthUom(String unitWidthUom) {
		this.unitWidthUom = unitWidthUom;
	}

	public String getExtnTransportMethodType() {
		return extnTransportMethodType;
	}

	public void setExtnTransportMethodType(String extnTransportMethodType) {
		this.extnTransportMethodType = extnTransportMethodType;
	}

	public Integer getExtnIsParcelCombination() {
		return extnIsParcelCombination;
	}

	public void setExtnIsParcelCombination(Integer extnIsParcelCombination) {
		this.extnIsParcelCombination = extnIsParcelCombination;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getItemPicture() {
		return itemPicture;
	}

	public void setItemPicture(String itemPicture) {
		this.itemPicture = itemPicture;
	}

	public Double getUnitSalePrice() {
		return unitSalePrice;
	}

	public void setUnitSalePrice(Double unitSalePrice) {
		this.unitSalePrice = unitSalePrice;
	}

}