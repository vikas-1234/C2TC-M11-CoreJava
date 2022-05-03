package com.tns.Repository;

import com.tns.Entities.Shop;

public interface IShopRepository {
	
	Shop addShop1(Shop shop);

	Shop updateShop1(Shop shop);

	Shop searchShopById(int id);

	boolean deleteShop(int id);

	void beginTransaction();

	void commitTransaction();

	Shop addShop11(Shop shop);

	Shop addShop(Shop shop);

	Shop updateShop(Shop shop);

}
