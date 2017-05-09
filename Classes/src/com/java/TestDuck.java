package com.java;

import java.io.FileNotFoundException;

public class TestDuck {

	public static void main(String[] args) throws FileNotFoundException {
		Duck duck = new Duck("Male", "White", 0);
		duck.printDetails();

//		duck.color = "White";
//		duck.gender = "Male";
//		duck.setColor("White");
//		duck.setGender("Male");
//		duck.setHeight(0);
//		x
//		duck.printDetails();
//		
//		System.out.println();
//		duck.setHeight(15);
//		duck.printDetails();
//		
//		System.out.println("\nHeight from getter:" +duck.getHeight());
	}
}
