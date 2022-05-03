package com.tns.Repository;

import javax.persistence.EntityManager;

import com.tns.Exception.ShopNotFoundException;

public abstract class ShopRepositoryImpl<Shop> implements IShopRepository {
	
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
	public Shop updateShop(Shop shop) {
		int a = ((com.tns.Entities.Shop) shop).getShopId();
		Shop sh = entityManager.find(null, a);
		try {
			if (sh == null) {
				throw new ShopNotFoundException("Shop not found");
			} else {
				entityManager.merge(shop);
			}
		} catch (ShopNotFoundException e) {
			System.out.println(e);
		}
		return sh;
	}

//	searchShopById
	@Override
	public com.tns.Entities.Shop searchShopById(int id) {
		Shop shop = entityManager.find(null, id);
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
		return (com.tns.Entities.Shop) shop;
	}

//	deleteShop
	@Override
	public boolean deleteShop(int shopId) {
		Shop shop = entityManager.find(null, shopId);
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
