package com.java.shapes;

public class TestCar {
	static Car c;

	public static void main(String[] args) {
		System.out.println("Before change");
		System.out.println(new Car().noOfWheels);

		c = new Car();
		c.name ="Car";
		c.noOfWheels = 2;
		System.out.println("Immediately after change");
		System.out.println(c.noOfWheels);
		
		System.out.println("After the change");

		System.out.println(new Car().noOfWheels);
		System.out.println(new Car().noOfWheels);
		System.out.println(new Car().noOfWheels);
		
		System.out.println(Car.noOfWheels);
	}

}


