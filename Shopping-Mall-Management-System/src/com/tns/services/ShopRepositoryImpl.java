package com.tns.services;


import java.util.*;
import javax.persistence.EntityManager;

import com.tns.entities.shop;
import com.tns.repository.IShopRepositoryDao;
import com.tns.repository.JPAUtil;

public abstract class ShopRepositoryImpl implements IShopRepositoryDao {
	private EntityManager entityManager;

//	Constructor
	public ShopRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addShop
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

//	updateShop
	public shop updateShop(Shop shop) {
		int a = ((com.tns.entities.shop) shop).getShopId();
		Shop sh = entityManager.find(Shop.class, a);
		try {
			if (sh == null) {
				throw new ShopNotFoundException("Shop not found");
			} else {
				entityManager.merge(shop);
			}
		} catch (ShopNotFoundException e) {
			System.out.println(e);
		}
		return (com.tns.entities.shop) sh;
	}

//	searchShopById
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		try {
			if (shop == null) {
				throw new ShopNotFoundException("Shop not found");
			} 
//			else {
//				System.out.println("Shop Name :- " + shop.getShopName());
//			}
		} catch (ShopNotFoundException e) {
			System.out.println(e);
		}
		return shop;
	}

//	deleteShop
	public boolean deleteShop(int shopId) {
		Shop shop = entityManager.find(Shop.class, shopId);
		try {
			if (shop == null) {
				throw new ShopNotFoundException("Shop not found");
			} else {
				entityManager.remove(shop);
			}
		} catch (ShopNotFoundException e) {
			System.out.println(e);
		}
		return false;
	}

//	beginTransaction
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

//	commitTransaction
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}