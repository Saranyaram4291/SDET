package JavaActivity1;

public class Car {

	public String color;
	public String transmission;
	public int make;
	public int tyres;
	public int doors;
	
	public Car() {
		
		this.tyres = 4;
		this.doors = 4;
	}
	
	public void displayCharacteristics()
	{
		System.out.println("Value of color is "+color);
		System.out.println("Value of transmission is "+transmission);
		System.out.println("Value of make is "+make);
		System.out.println("Value of no of tyres is "+tyres);
		System.out.println("Value of no of doors is "+doors);
		
		
	}
	
	public void accelarate()
	{
		
		System.out.println("Car is moving forward.");
		
	}
	
	public void brake()
	{
		
		System.out.println("Car has stopped.");
		
	}
	
	
}
