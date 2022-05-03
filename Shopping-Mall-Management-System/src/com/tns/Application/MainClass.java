package com.tns.Application;

import com.tns.Service.IShopService;
import java.time.LocalDate;

import com.tns.Entities.Shop;
import com.tns.Repository.*;
import com.tns.Service.*;

public class MainClass {

	public static void main(String[] args) {
		
		IShopService serviceShop = new ShopService();
//		Shop<Object, Object> shop=new Shop<>();
		
		
		Shop shop = new Shop();
		
		/* Create Operation */
		shop.setShopId(100);
		shop.setShopCategory("Food");
		shop.setShopName("Zomato");
		shop.setShopStatus("Open");
		shop.setLeaseStatus("Paid");
		
		serviceShop.addShop(shop);
//		System.out.println(serviceShop);
		
//		shop=serviceShop.addShop(shop);
//		System.out.println("ShopId : " + shop.getShopId());
//		System.out.println("ShopCategory : " + shop.getShopCategory());
//		System.out.println("ShopName : " + shop.getShopName());
//		System.out.println("ShopStatus : " + shop.getShopStatus());
//		System.out.println("LeaseStatus : " + shop.getLeaseStatus());



		/* search */

//		shop = serviceShop.searchShopById(100);
//		System.out.println("ShopId : " + shop.getShopId());
//		System.out.println("ShopName : " + shop.getShopName());
		
		
		
		/* update */
//		shop = serviceShop.searchShopById(100);
//		shop.setShopName("PizzaHut");
//		serviceShop.updateShop(shop);
		
		
		
		/* remove */
//		serviceShop.deleteShop(100);
		
		
	}

}
