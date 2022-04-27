package com.tns.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;

@Entity
@ Table(name="item")
public class Item implements Serializable {

		   private static final long serialVersionUID =1L;
	
		   private int ItemiId;
	       private String name;
	       private LocalDate manufacturing;
	       private LocalDate expiry;
	       private float price;
	       private String category;
	       
	       @ManyToOne
	       @JoinColumn(name="shopId")
	       
		public int getItemiId() {
			return ItemiId;
		}
		public void setItemiId(int itemiId) {
			ItemiId = itemiId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getManufacturing() {
			return manufacturing;
		}
		public void setManufacturing(LocalDate manufacturing) {
			this.manufacturing = manufacturing;
		}
		public LocalDate getExpiry() {
			return expiry;
		}
		public void setExpiry(LocalDate expiry) {
			this.expiry = expiry;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		/**
		 * @param itemiId
		 * @param name
		 * @param manufacturing
		 * @param expiry
		 * @param price
		 * @param category
		 */
		public Item(int itemiId, String name, LocalDate manufacturing, LocalDate expiry, float price, String category) {
			super();
			ItemiId = itemiId;
			this.name = name;
			this.manufacturing = manufacturing;
			this.expiry = expiry;
			this.price = price;
			this.category = category;
		}
		@Override
		public String toString() {
			return "Item [ItemiId=" + ItemiId + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry="
					+ expiry + ", price=" + price + ", category=" + category + ", getItemiId()=" + getItemiId()
					+ ", getName()=" + getName() + ", getManufacturing()=" + getManufacturing() + ", getExpiry()="
					+ getExpiry() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	       
	     
		
	       
	       
	       
	       
	
}
