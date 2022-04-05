package com.tns.Application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc  extends NormalAcc{

	/**
	 * @param accNO
	 * @param accNm
	 * @param charges
	 */
	// Here defining the construct of GSNormalAcc class
	
	public GSNormalAcc(int accNO, String accNm, float charges, float deliveryCharges) {
		super(accNO, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	
	// Here Defining the method of bookProduct
	
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}

	// Here Defining the toString method
	@Override
	public String toString() {
		return super.toString();
	}
	
	 
	
	
	

}
