package javaClassesAndObjectsCarTTSHW;

public class Car {
	
	// TODO create a Car Class with 3 private instance variables, 3 constructors, 3 Getters and 3 Setters, Boolean method, String method

	private String make;
	private String model;
	private String color;
	
	// 3 constructors
	public Car() {}
	
	public Car (String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	public Car (String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	// 3 Getters and 3 Setters
	public String getMake()
	{
		return make;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}

}
