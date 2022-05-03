package com.tns.Application;

import java.util.List;

import com.tns.Entities.Item;
import com.tns.Entities.Shop;
import com.tns.Entities.ShopOwner;
import com.tns.Repository.IShopRepository;
import com.tns.Service.IShopService;

public class ShopService implements IShopService {
	
	private IShopRepository ShopDAO;
//	private IEmployeeRepository EmployeeDAO;
//	IEmployeeService serviceEmp;
	
	public ShopService() {
		ShopDAO = new ShopRepository();
//		ShopOwnerDAO = new ShopOwnerRepository();
//		EmployeeDAO = new EmployeeRepository();
//		serviceEmp = new EmployeeService();
//		ItemDAO = new ItemRepository();
	}
	

	@Override
	public Shop addShop(Shop shop) {
		ShopDAO.beginTransaction();
		shop = ShopDAO.addShop(shop);
		ShopDAO.commitTransaction();
		System.out.println("1Shop Created");
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		ShopDAO.beginTransaction();
		ShopDAO.updateShop(shop);
		ShopDAO.commitTransaction();
		System.out.println("Shop updated");
		return shop;
	}

	
	@Override
	public Shop searchShopById(int shopId) {
		Shop shop = ShopDAO.searchShopById(shopId);
		System.out.println("Check Shop Details");
		return shop;
	}

	@Override
	public boolean deleteShop(int shopId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		return shopOwner;
//		ShopOwnerDAO.beginTransaction();
//		shopOwner = ShopOwnerDAO.addShopOwner(shopOwner);
//		ShopOwnerDAO.commitTransaction();
//		return shopOwner
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		return shopOwner;
//		ShopOwnerDAO.beginTransaction();
//		shopOwner = ShopOwnerDAO.updateShopOwner(shopOwner);
//		ShopOwnerDAO.commitTransaction();
//		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(int shopOwnerId) {
		return null;
//		ShopOwner shopOwner = ShopOwnerDAO.searchShopOwner(shopOwnerId);
//		return shopOwner;
	}

	@Override
	public boolean deleteShopOwner(int shopOwnerId) {
		return false;
//		ShopOwnerDAO.beginTransaction();
//		ShopOwnerDAO.deleteShopOwner(shopOwnerId);
//		ShopOwnerDAO.commitTransaction();
//		return true;
	}

	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> addItems(List<Item> items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item deleteItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
