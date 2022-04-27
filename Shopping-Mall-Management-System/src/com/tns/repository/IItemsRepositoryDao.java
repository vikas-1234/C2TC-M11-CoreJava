package com.tns.repository;

import java.util.*;

import com.tns.entities.Item;

public interface IItemsRepositoryDao {
	
	public abstract Item addItem(Item item);
	public abstract Item updateItem(Item item);
	public abstract Item searchItem(long id);
	public abstract Item deleteItem(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
