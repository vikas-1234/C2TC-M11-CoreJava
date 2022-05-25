package com.tns.Application;

import com.tns.framework.*;

public  class GSShopFactory  extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
		//		return null;
	}

	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges,float deliveryCharges) {
		// TODO Auto-generated method stub
		
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		System.out.println(GsNormal.toString());
		return GsNormal;
		//	return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
