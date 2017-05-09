package com.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Duck {
	String gender, color;
	private int height;
	
	Duck(String gender, String color, int height) throws FileNotFoundException{
		
		new FileOutputStream("");
		
		if(gender=="Male" || gender=="Female")
			this.gender = gender;
		
		this.color = color;

		if(height<=0)
			this.height = 10;
		else
			this.height = height;
	}
	
	int getHeight(){
		return height;
	}
	
	
	String getGender(){
		return gender;
	}
	
	
	String getColor(){
		return color;
	}
	
	void printDetails(){
		System.out.println("Gender: " + gender);
		System.out.println("Color: " + color);
		System.out.println("Height: " + height);
	}

}
