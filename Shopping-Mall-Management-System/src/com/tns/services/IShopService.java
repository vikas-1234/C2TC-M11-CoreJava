package com.tns.services;

import java.util.*;
import com.tns.entities.*;

public abstract class IShopService {
	
	abstract Shop addShop(Shop shop);

	abstract Shop updateShop(Shop shop);

	abstract Shop searchShopById(int shopId);

	abstract boolean deleteShop(int shopId);

//	abstract ShopOwner addShopOwner(ShopOwner shopOwner);
//
//	abstract ShopOwner updateShopOwner(ShopOwner shopOwner);
//
//	abstract ShopOwner searchShopOwner(int shopOwnerId);
//
//	abstract boolean deleteShopOwner(int shopOwnerId);
//
//	abstract boolean addEmployee(Employee employee);
//
//	abstract boolean addEmployees(List<Employee> employees);
//
//	abstract List<Employee> searchEmployeesByShopId(int id);
//
//	boolean updateEmployee(Employee employee);
//
//	boolean deleteEmployee(int id);

	abstract Item addItem(Item item);

	abstract Item updateItem(Item item);

	abstract List<Item> addItems(List<Item> items);

	abstract Item deleteItem(int id);
}
