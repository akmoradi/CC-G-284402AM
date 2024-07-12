package oop.grundlagen;

public class Car {
	// Attributes
	private String brand;
	private String model;
	private int year;
	
	// Constructor
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	// Method to display car details
	public void displayDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
	
	// Method to start the car
	public void start() {
		System.out.println(brand + " " + model + " is starting.");
	}
	
}
