package activities;

interface BicycleParts{
	
	public int tyres = 2;
	
	public int maxSpeed = 40;
}

interface BicycleOperations{
	
	public void applyBrake(int decrement);
    public void speedUp(int increment);
}

public class BiCycle implements BicycleParts, BicycleOperations {
	
	public int gears; 
	public int currentSpeed; 
	
	public BiCycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		System.out.println("Current Speed is: " +currentSpeed);
		currentSpeed = currentSpeed-decrement;
		System.out.println("After decreasing the speed to " +decrement+ " current speed is " +currentSpeed);
		
	}

	@Override
	public void speedUp(int increment) {
		System.out.println("Current Speed is: " +currentSpeed);
		currentSpeed = currentSpeed+increment;
		System.out.println("After increasing the speed to " +increment+ " current speed is " +currentSpeed);
		
	}
	
	public String bicycleDesc() {
        return("No of gears are: " + gears + "\nSpeed of bicycle is: " + maxSpeed);
    }
	

}

class MountainBike extends BiCycle{

	public int seatHeight;
	public MountainBike(int gears, int currentSpeed, int startHeight) {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
	public void setHeight(int newSeatHeight) {
        seatHeight = newSeatHeight;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is: " + seatHeight);
    }  
	
}
