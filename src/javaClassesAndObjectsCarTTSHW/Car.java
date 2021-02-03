package javaClassesAndObjectsCarTTSHW;

public class Car {
	
	// TODO create a Car Class with 3 private instance variables, 3 constructors, 3 Getters and 3 Setters, Boolean method, String method

	private String make;
	private String model;
	private String color;
	
	// 3 constructors
	public car() {}
	
	public car (String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public car (String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

}
