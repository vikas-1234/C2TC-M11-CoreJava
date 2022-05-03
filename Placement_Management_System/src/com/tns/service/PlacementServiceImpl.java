package com.tns.service;

import com.tns.entity.Placement;
import com.tns.dao.PlacementDao;
import com.tns.dao.PlacementDaoImpl;

public class PlacementServiceImpl implements PlacementService{

    private PlacementDao dao;
	
	public PlacementServiceImpl() {
		dao = new PlacementDaoImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public void searchPlacement(long id) {
		Placement placement = dao.searchPlacement(id);
		return;
	}

	@Override
	public void cancelPlacement(long id) {
	  dao.beginTrancsaction();
	  dao.cancelPlacement(id);
	  dao.commitTransaction();
	}
		
}
