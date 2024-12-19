package practice;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	// Constructor
	Car() {
		tyres = 4;
		doors = 4;
	}

	// Method
	public void displayCharacteristics() {

		System.out.println("Color of the car is " + color);
		System.out.println("Transmission of the car is " + transmission);
		System.out.println("Car manufactured in year " + make);
		System.out.println("Total number of tyres are " + tyres);
		System.out.println("Total number of doors are " + doors);
	}

	// Method
	public void accelarate() {
		System.out.println("Car is moving forward");
	}

	// Method
	public void brake() {
		System.out.println("Car has stopped");
	}

}
