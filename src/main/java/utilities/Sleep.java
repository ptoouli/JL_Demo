package utilities;

public class Sleep
{
	
	public static void sleep () 
	{
	
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
