package JavaActivityDay3;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	public static void main(String args[])
	{
		Set<String> obj=new HashSet<String>();
		obj.add("Phone");
		obj.add("email");
		obj.add("laptop");
		obj.add("tv");
		obj.add("fax");
		obj.add("ac");
		
		System.out.println("Size of hashSet is "+obj.size());
		
		if(obj.remove("ac"))
			{
			System.out.println("Element is removed");
			};
		
		obj.remove("ac1");
		
		System.out.println("Check for element present "+obj.contains("tv"));
		
		System.out.println("Current values of hashset "+obj);
		
	}
}
