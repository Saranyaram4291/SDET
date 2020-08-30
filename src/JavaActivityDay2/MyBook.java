package JavaActivityDay2;

public class MyBook extends Book {

	@Override
	void setTitle(String titleValue) {
		// TODO Auto-generated method stub
		title=titleValue;
	}
	
	public static void main(String args[])
	{
		Book newNovel=new MyBook();
		
		newNovel.setTitle("Python");
		System.out.println("Title of book is "+newNovel.getTitle());
		
	}
	

}
