package JavaActivityDay2;

public class ExceptionDemo {


	
	
	public static void main(String args[])
	{
		try
		{
			ExceptionDemo e=new ExceptionDemo();
			e.exceptionTest("check");
			e.exceptionTest(null);
		}
		catch(CustomException e)
		{
			System.out.println("Exception caught by this value "+e.getMessage());
		}
	}
	

	
	public void exceptionTest(String msg) throws CustomException
	{
		
		if(msg==null)
		{
			throw new CustomException(msg);
			
		}
	}

}