package com.tns.Application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	//Here declaring the Charges variable with private static final
	private static final float Charges=0;
	
	// Here getting the method of Charges
	public float getCharges() {
		return Charges;
	}

	/**
	 * @param accNO
	 * @param accNm
	 * @param charges
	 * @param isPrime
	 */
	// Defining the constructor of GSPrimeAcc with member variable
	public GSPrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		super(accNO, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	// Here defning the method of bookProduct
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}
	
	// Here defining the toString Method
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
