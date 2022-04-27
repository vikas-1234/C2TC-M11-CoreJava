package com.tns.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.tns.entities.Item;
import com.tns.repository.JPAUtil;

public class IshopServiceImpl implements IItemRepository {
	private EntityManager entityManager;

//	Constructor
	public IshopServiceImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

//	addItem
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

//	updateItem
	public Item updateItem(Item item) {
		int a = item.getItemiId();
		Item i = entityManager.find(Item.class,a);
		try {
			if (i == null) {
				throw new InvalidItemException("Item not Found !!");
			} else {
				entityManager.merge(item);
			}
		} catch (InvalidItemException e) {
			System.out.println(e);
		}
		return null;
	}

//	searchItem
	@SuppressWarnings("unchecked")
	@Override
	public Item searchItem(String str) {
		Query query = entityManager.createQuery("Select i from Item i where i.name LIKE :a ");
		query.setParameter("a", "%" + str + "%");
		List<Item> list = query.getResultList();
		System.out.println("Item :");
		for (Item s : list) {
			System.out.println(s.getItemiId() + " " + s.getName() + "|  Price:" + s.getPrice());
		}
		return null;
	}
	
	@Override
	public Item searchItem(int id) {
		Item i = entityManager.find(Item.class, id);
		return i;
	}

//	deleteItem
	@Override
	public Item deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		try {
			if (item == null) {
				throw new InvalidItemException("Item not Found !!");
			} else {
				entityManager.remove(item);
			}
		} catch (InvalidItemException e) {
			System.out.println(e);
		}
		return item;
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