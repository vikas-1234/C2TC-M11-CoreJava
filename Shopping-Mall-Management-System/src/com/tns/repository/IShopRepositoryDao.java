package com.tns.repository;

import java.util.*;

import com.tns.entities.shop;
import com.tns.services.Shop;

public interface IShopRepositoryDao {
	
	public abstract shop  searchShopById(long id);
	public abstract Shop  addShop(Shop shop);
	public abstract shop  updateShop(Shop shop);
	public abstract boolean  deleteShop(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
