package JavaActivityDay2;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane=new Plane(10);
		
		//Add names to the passengers list using the onboard method.
		plane.onboard("Saranya");
		plane.onboard("Ram");
		
		
		//Print the take-off time using the takeOff() method.
		System.out.println("Take off time "+plane.takeOff());
		
		//Print the list of passengers using the getPassengers() method.
		
		System.out.println(plane.getPassesngers());
		
		//Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.
		Thread.sleep(5000);
		
		//Land() the plane and print the time of landing using getLastTimeLanded() method.
		
		plane.land();
		System.out.println("Landed time "+plane.getLastTimeLanded());
		
		
		
		
		
		
		
	}

}
