package com.java;

public class Mobile {
	
	int storage = 512;
	String type = "Bar";
	int size = 7;
	
	void call(){
		System.out.println("Making a call");
	}
	
	
	void printDetails(){
		System.out.println("Storage " + storage);
		System.out.println("type " + type);
		System.out.println("size " + size);	
	}
	
	void printPrice(int noOfPhones){
		int totalPrice = noOfPhones*1000;
		System.out.println(totalPrice);
		
	}

}
