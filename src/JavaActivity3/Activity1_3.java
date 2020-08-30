package JavaActivity3;

public class Activity1_3 {

	public static void main(String args[])
	{
		double seconds=1000000000;
		double earth = 31557600;
		double mercury = 0.2408467;
		double venus = 0.61519726;
		double mars = 1.8808158;
		double jupiter = 11.862615;
		double saturn = 29.447498;
		double uranus = 84.016846;
		double neptune = 164.79132;
		
		System.out.println("Earth age: "+seconds/earth);
		System.out.println("Mercury age: "+seconds/earth/mercury);
		System.out.println("venus age: "+seconds/earth/venus);
		System.out.println("Mars age: "+seconds/earth/mars);
		System.out.println("Jupiter age: "+seconds/earth/jupiter);
		
	}
}
