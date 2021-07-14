package com.company;

public class Main {

	public static void main(String[] args) {
		// Assignment
// Write a Circle class, that takes in the radius as a field
// Create 2 constructors, one with the field as a parameter and one without.
// write methods to find the circumference and area of the circle

//        The radius should be taken from the user

		// Instantiate our circle class.
		// firstCircle is an instance of the object of the type Circle.
//        Circle firstCircle = new Circle();
//        firstCircle.setRadius(7);
//
//        System.out.println("Area of firstCircle: " + firstCircle.getArea());
//        System.out.println("Circumference of firstCircle: " + firstCircle.getCircumference());
//
//        // Another instance of the circle object
//        Circle secondCircle = new Circle(14);
//        System.out.println("Area of secondCircle: " + secondCircle.getArea());
//        System.out.println("Circumference of secondCircle: " + secondCircle.getCircumference());
//


		// Instantiate a new vehicle.
		Vehicle vehicle = new Vehicle();

		vehicle.setLengthOfVehicle(10);
		vehicle.setNoOfTires(4);
		vehicle.setNumberOfSeats(4);
		vehicle.setNameOfVehicle("Volkswagen");
		vehicle.setCurrentSpeed(50);

		vehicle.startEngine();
		System.out.println(vehicle.getCurrentSpeed());
		vehicle.stopEngine();
		System.out.println(vehicle.getCurrentSpeed());


	}

}
