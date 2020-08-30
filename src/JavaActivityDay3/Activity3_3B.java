package JavaActivityDay3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {
	
	public static void main(String args[])
	{
		Deque<String> dq=new LinkedList<String>();
		dq.add("Cat");
		dq.add("Dog");
		dq.add("Lion");
		dq.add("Tiger");
		dq.add("Elephant");
		dq.add("Zebra");
		
		Iterator<String> itr=dq.iterator();
		
		System.out.println("Items at deque are:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Peek Element at first "+dq.peekFirst());
		
		System.out.println("Peek Element at last "+dq.peekLast());
		
		if(dq.contains("Wolf"))
		{
			System.out.println("Wolf is present");
		}
		else
		{
			System.out.println("Wolf is not present");
		}
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println("Elements post removal "+dq);
		
	}

}
