package JavaActivityDay3;

import java.util.ArrayList;
import java.util.List;

public class Activity3_1 {

	public static void main(String args[])
	{
		List<String> myList=new ArrayList<String>();
		
		//Add 5 names to the ArrayList using add() method.
		
		myList.add("Saranya");
		myList.add("Ram");
		myList.add("moorthy");
		myList.add("Shyla");
		myList.add("Gowthami");
		
		Activity3_1 act=new Activity3_1();
		act.print(myList);
		act.get(myList, 3);
		myList.add(1,"Surei");
		act.print(myList);
		act.contains(myList, "Gowthami");
		act.size(myList);
		act.remove(myList, "Shyla");
	
	}
	
	public void print(List<String> myList)
	{
		System.out.println("Values in the array ");
		for(String str:myList)
		{
			System.out.println(str);
		}
	}
	
	public void get(List<String> myList,int index)
	{
		
		System.out.println("Element at "+index+" position is "+myList.get(index));
	}
	
	public void contains(List<String> myList,String str)
	{
		System.out.println("Value is present "+myList.contains(str));
	}
	
	
	public void size(List<String> myList)
	{
		System.out.println("No of values at list is "+myList.size());
	}
	
	public void remove(List<String> myList,String str) 
	{
						
				myList.remove(str);
	
		System.out.println("No of values at list post removal "+myList.size());
	}
}
