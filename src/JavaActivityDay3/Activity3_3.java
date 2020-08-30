package JavaActivityDay3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3 {

	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(12);
		q.add(45);
		q.add(78);
		q.add(9);
		q.add(21);
		
		System.out.println("Initial queue value "+q);
		
		q.remove();
		
		System.out.println("Post removal peek value "+q.peek());
			
		
		System.out.println("Updated queue after removal "+q);
		
		System.out.println("Queue size now "+q.size());
		
		System.out.println("updated queue"+q);
		

		
		
	}
}
