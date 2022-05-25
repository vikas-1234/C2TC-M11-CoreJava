package com.tns.framework;

public abstract class ShopAcc {

	// here declaring account number
	private  int accNo;

	// here getting account number
	public int getAccNo() {
		return accNo;
	}
	// here declaring account name
	private String accNm;

	// here getting account number
	public String getAccNm() {
		return accNm;
	}
	// Here setting account number
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	// here declaring charges for shopping
	private float charges;

	// here getting charges for shopping
	public float getCharges() {
		return charges;
	}
	// here defining the constructor for shopping classes
	public ShopAcc(int accNO, String accNm, float charges )
	{
		this.accNo=accNO;
		this.accNm=accNm;
		this.charges=charges;
	}
	// here defining abstract bookProduct
	public void bookProduct(float a) {
		
	}
	// here defining item method to display the item
	public void items (float y) {

	}
	public String toString() { 
		return accNm;
		
	}
}
