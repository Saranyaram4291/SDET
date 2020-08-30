package JavaActivityDay2;

public class CustomException extends Exception{

	private String message;
	
	public CustomException(String s)
	{
		message=s;
		
	}
	
	@Override
	public String getMessage()
	{
		return message;
	}
	
	
}
