package JavaActivityDay2;

public class MountainBike extends Bicycle{

	private int seatHeight;

	public void setHeight(int newValue) {
	  int  seatHeight = newValue;
	}
	
	public MountainBike(int gears,int speed,int seatHeight)
	{
		super(gears,speed);
		seatHeight=0;
	}
	
	public String bicycleDesc() {
	
		return(super.bicycleDesc());
	}
	
	
}
