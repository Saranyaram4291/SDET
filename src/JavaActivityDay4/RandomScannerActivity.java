package JavaActivityDay4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Random indexGen=new Random();
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Pls enter the input values");
		while(scan.hasNextInt())
		{
			list.add(scan.nextInt());
		}
		
		int index=indexGen.nextInt(list.size());
		
		System.out.println("Index values"+index);
		
		System.out.println("Value at generated index is "+list.get(index));
	}
	
}

	 

