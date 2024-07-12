package oop.grundlagen;

// Main class to test the car class

public class CarPlay {

	public static void main(String[] args) {

		// Create a car object
		Car myCar = new Car("Toyota", "Camry", 2020);
		
		// Call method on the Car object
		myCar.displayDetails();
		myCar.start();
	}

}
