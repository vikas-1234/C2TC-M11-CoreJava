package com.tns.services;

public class InvalidItemException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidItemException(String str) {
		super(str);
	}
}
