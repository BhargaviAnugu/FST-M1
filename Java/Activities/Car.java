package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color,String transmission,int make) {	
		this.color = color;
		this.transmission =transmission;
		this.make =make;
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		
		System.out.println("Color of the car is: " +color);
		System.out.println("transmission of the car is: " +transmission);
		System.out.println("manufacturing of the car is: " +make);
		System.out.println("Number of tyres of the car is: " +tyres);
		System.out.println("Number of doors of the car is: " +doors);
		
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
