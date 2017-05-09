package com.java.shapes;

public class TestShape {

	public static void main(String[] args) {
		Shape shape = new Shape();
		TwoD twoD = new TwoD();
		ThreeD threeD = new ThreeD();
		Square square = new Square();
		Circle circle = new Circle();
		Cube cube = new Cube();
		Cone cone = new Cone();
		
		square.length=10;
		System.out.println(square.area());
		
		//circle.length=20;
		System.out.println(circle.area());
		
		cube.length = 40;
		
		System.out.println(cube.area());
		System.out.println(cube.volume());
		
		cone.length=50;
		cone.height=8;
		
		System.out.println(cone.area());
		System.out.println(cone.volume());
		
	}

}
