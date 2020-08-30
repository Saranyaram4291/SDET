package JavaActivity2;

public class Activity2 {

	public static void main(String args[])
	{
		
		int checkArray[]={10, 77, 10, 54, -11, 10};
		int value=0;
		
			for(int i=0;i<checkArray.length;i++)
			{
				if(checkArray[i]==10)
				{
					value=value+10;
				}
			}
		
			if(value==30)
			{
			System.out.println("Value is equal to 30");
			}
			else
			{
				System.out.println("Value is not equal to 30");
			}
		}
}
