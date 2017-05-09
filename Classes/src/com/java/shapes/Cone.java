package com.java.shapes;

public class Cone extends ThreeD {
	double area(){
		return 3.14*length*length+3.14*length*height;
	}
	
	double volume(){
		return 3.14*length*length*height; 
	}
}
