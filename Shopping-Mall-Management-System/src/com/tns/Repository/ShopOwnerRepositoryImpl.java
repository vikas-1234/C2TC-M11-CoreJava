package com.tns.Repository;

import javax.persistence.EntityManager;

import com.tns.Entities.ShopOwner;

public abstract class ShopOwnerRepositoryImpl implements IShopOwnerRepository {
	
	private EntityManager entityManager;

//	Constructor
	public ShopOwnerRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addShopOwner
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}

//	updateShopOwner
	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		entityManager.merge(shopOwner);
		return shopOwner;
	}

//	searchShopOwner
	@Override
	public ShopOwner searchShopOwner(int id) {
		ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
		return shopOwner;
	}

//	deleteShopOwner
	@Override
	public ShopOwner deleteShopOwner(int id) {
		// TODO Auto-generated method stub
		ShopOwner shopOwner = entityManager.find(ShopOwner.class, id);
		 entityManager.remove(shopOwner);
//		return true;
		return shopOwner;
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
