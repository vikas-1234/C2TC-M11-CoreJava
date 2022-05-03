package com.tns.Service;

import com.tns.Entities.Item;
import com.tns.Entities.Shop;
import com.tns.Entities.ShopOwner;

import java.util.*;

public interface IShopService {


	Shop addShop(Shop shop);

	Shop updateShop(Shop shop);

	Shop searchShopById(int shopId);

	boolean deleteShop(int shopId);

	ShopOwner addShopOwner(ShopOwner shopOwner);

	ShopOwner updateShopOwner(ShopOwner shopOwner);

	ShopOwner searchShopOwner(int shopOwnerId);

	boolean deleteShopOwner(int shopOwnerId);

//	boolean addEmployee(Employee employee) {
//		return false;
//	}
//
//	boolean addEmployees(List<Employee> employees);
//
//	List<Employee> searchEmployeesByShopId(int id);
//
//	boolean updateEmployee(Employee employee);
//
//	boolean deleteEmployee(int id);

	Item addItem(Item item);

	Item updateItem(Item item);

	List<Item> addItems(List<Item> items);

	Item deleteItem(int id);
	
}
