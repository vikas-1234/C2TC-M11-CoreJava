package com.tns.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@SuppressWarnings("unsed")
@Entity
@Table(name="shop")
public class shop implements Serializable{

	private static final long serialVersionUID = 1L;
	private int shopId;
	private String shopCategory;
	private String shopName;
	private String shopStatus;
	private String leaseStatus;
	/**
	 */
	public shop() {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	
	
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", shopStatus="
				+ shopStatus + ", leaseStatus=" + leaseStatus + ", getShopId()=" + getShopId() + ", getShopCategory()="
				+ getShopCategory() + ", getShopName()=" + getShopName() + ", getShopStatus()=" + getShopStatus()
				+ ", getLeaseStatus()=" + getLeaseStatus() + "]";
	}
	
	
	
}
