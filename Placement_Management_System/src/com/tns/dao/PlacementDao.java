package com.tns.dao;
import java.util.List;

import com.tns.entity.Placement;

public interface PlacementDao {

	public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(long id);

	void beginTrancsaction();

	void cancelPlacement(long id);

	void commitTransaction();
}
