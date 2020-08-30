package JavaActivity3;

public class Activity1_4 {
	
	public static void main(String args[])
	{
		int inputValue[]={10,9,15,7,34};
		
		Activity1_4 act=new Activity1_4();
		
		System.out.println("Before sorting");
		
		act.displayArray(inputValue);
		
		
		for(int i=1;i<inputValue.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				if(inputValue[i]>inputValue[j])
				{
					break;
				}
				else
				{
					int swap=inputValue[i];
					inputValue[i]=inputValue[j];
					inputValue[j]=swap;
					
				}
			}
		}
		
		System.out.println("After sorting");
		
		act.displayArray(inputValue);
				
	}

	private void displayArray(int inputValue[]) {
		System.out.println("value of input values");
		for(int sort:inputValue)
		{
			System.out.println(sort);
		}
	}

}
