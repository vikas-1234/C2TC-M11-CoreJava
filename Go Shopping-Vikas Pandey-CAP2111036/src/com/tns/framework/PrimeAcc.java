package com.tns.framework;
public abstract class PrimeAcc extends ShopAcc {
	
	// Here declaring the isPrime instance member variable
	private boolean isPrime=true;
	
	float charges;

	// Here Defining the method isPrime which return the whether isPrime is true or false
	public boolean isPrime() {
		return isPrime;
	}
	
    // Here Declaring the Delivery Charges for the product, Initial will put Zero Balance
	private static final float deliveryCharges=0;

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	  //	 Here defining the Constructor for PrimeAcc:
	
	public PrimeAcc(int accNO, String accNm, float charges,boolean isPrime) {
		super(accNO, accNm, charges);
		this.charges=charges;
		// TODO Auto-generated constructor stub
		this.isPrime=isPrime;
	}
	
	// Here defining method for bookProduct:
	@Override
	public void bookProduct( float x) {
		System.out.println();
		
	}

	@Override
	public String toString() {
		return "Dear Prime user, Your Product charges are: " +charges;
	}
	
	
	// Here defining toString method:
   
	
	
	

}
