package JavaActivityDay2;

public class Bicycle implements BicycleOperations {

	private int currentSpeed;
	private int gears;
	

	public Bicycle(int gears, int speed) {
		// TODO Auto-generated constructor stub
		this.gears=gears;
		this.currentSpeed=speed;
	}


	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed-=decrement;
	}


	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed+=increment;
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
	
	

}
