package JavaActivityDay2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	private List<String> passengers;
	private int  maxPassengers;
	private Date lastTimeTookOf;
	private LocalDate lastTimeLanded;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date(); 
	

	
	public Plane(int i) {
		 maxPassengers=i;
		 passengers=new ArrayList<String>();
	}

	public Plane()
	{
	 maxPassengers=0;
	 passengers=null;
	}
	
	void plane(int maxPass)
	{
		 maxPassengers=maxPass;
		 passengers=null;
	}

	public void onboard(String s)
	{
		passengers.add(s);
	}
	
	public LocalDate takeOff()
	{
		 
		return java.time.LocalDate.now();
		
	}
	
	public void land()
	{
		lastTimeLanded=java.time.LocalDate.now();
		passengers.clear();
		
	}
	
	public LocalDate getLastTimeLanded()
	{
		return lastTimeLanded;
	}
	
	public List<String> getPassesngers()
	{
		return passengers;
	}
	
	
}
