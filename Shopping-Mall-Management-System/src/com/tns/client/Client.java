package com.tns.client;

import java.security.Provider.Service;

import com.tns.entities.shop;
import com.tns.services.IShopService;
import com.tns.services.IshopServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		IshopServiceImpl shopdao=new IshopServiceImpl();
		
		shop sp=new shop();
		
		// Create Operation
		
		sp.setShopId(100);
		sp.setShopName("Vikas Interprise");
		sp.setShopCategory("Chemical Product");
//		sp.setShopStatus(shopStatus);
//		sp.setLeaseStatus(leaseStatus);
//		shopdao.add
//		
		
		
		
		
		

	}

}
