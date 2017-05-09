package com.java;

public class TestShape {
	public static void main(String args[]){
		Shape shape = new Shape();
		int squareArea = shape.area(30);
		int rectangleArea = shape.area(20,70);
		int totalArea = squareArea + rectangleArea;
		System.out.println(totalArea);
	}

}
