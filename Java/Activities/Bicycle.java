package activity;

public class Bicycle implements BicycleParts, BicycleOperations {

	int gears;
	int currentSpeed;

	// Constructor
	Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	// Bicycle class methods
	public void applyBrake(int decrement) {
		currentSpeed = currentSpeed - decrement;
		System.out.println("Current speed: "+currentSpeed);
	}

	public void speedUp(int increment) {
		currentSpeed = currentSpeed + increment;
		System.out.println("Current speed: "+currentSpeed);
	}
	
	public String bicycleDesc() {
		System.out.println("Number of gears is "+gears);
		System.out.println("maxSpeed is "+maxSpeed);
		
		return(gears +" and "+maxSpeed);
	}

}
