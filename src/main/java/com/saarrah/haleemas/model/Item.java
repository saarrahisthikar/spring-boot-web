package com.saarrah.haleemas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue
	private Integer itemId;

	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Temporal(TemporalType.DATE)
	@Column(name = "production_date")
	private Date productionDate;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", productionDate=" + productionDate + "]";
	}

}
