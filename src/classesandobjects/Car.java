package classesandobjects;

public class Car {
	
	String company;
	String model;
	double price;
	static int wheels = 4;
	
	public Car(String company,String model,double price) {
		this.company = company;
		this.model=model;
		this.price=price;
	}
	
	public void startCar() {
		System.out.println("Car having model "+model+" and company "+company+" has started");
	}
	
	public void stopCar() {
		System.out.println("Car having model "+model+" and company "+company+" has stopped");
	}
	
	public void carDetails() {
		System.out.println("Model of the car is "+model);
		System.out.println("Company of the car is "+company);
		System.out.println("Price of the car is "+price);
		System.out.println("Number of Wheels of the car are "+wheels);
		System.out.println("");
	}
	
}
