package com.tns.service;

import com.tns.entity.Placement;

public interface PlacementService {

    public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract void searchPlacement(long id);
	
	public abstract void cancelPlacement(long id);
}
