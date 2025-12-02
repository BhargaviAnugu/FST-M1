package activities;

public class Activity7 {
	
	public static void main(String[] args) {
		
		MountainBike mountainb = new MountainBike(4, 40, 50);
		mountainb.setHeight(100);
		System.out.println(mountainb.bicycleDesc());
		mountainb.speedUp(20);
		mountainb.applyBrake(5);
	}

}
