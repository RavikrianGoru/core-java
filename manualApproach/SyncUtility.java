import lombok.Synchronized;

public class SyncUtility {

	private final Object readLock = new Object();

	@Synchronized
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	
	@Synchronized
	public static void wishUs()
	{
		System.out.println("Wish you good luck");
	}
	
	@Synchronized("readLock")
  	public void proposeUs() 
	{
    	System.out.println("I Love You");
  	}
}

