package com.tns.Repository;

import com.tns.Entities.ShopOwner;

public interface IShopOwnerRepository {
	
	ShopOwner addShopOwner(ShopOwner shopOwner);

	ShopOwner updateShopOwner(ShopOwner shopOwner);

	ShopOwner searchShopOwner(int id);

	ShopOwner deleteShopOwner(int id);

	void commitTransaction();

	void beginTransaction();

}
