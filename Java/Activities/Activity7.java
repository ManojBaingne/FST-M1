package activity;

public class Activity7 {

	public static void main(String[] args) {
		
		MountainBike mb = new MountainBike(3,10,25);
		System.out.println(mb.currentSpeed);
		mb.speedUp(20);
		mb.applyBrake(5);

	}

}
