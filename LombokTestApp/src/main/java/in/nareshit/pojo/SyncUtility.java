package in.nareshit.pojo;

import lombok.Synchronized;
import lombok.extern.java.Log;

@Log
public class SyncUtility {

	@Synchronized
	public void sayHello()
	{
		System.out.println("Hello");
		log.severe("AbcD");
	}
	
	
	@Synchronized
	public static void wishUs()
	{
		System.out.println("Wish you good luck");
	}
}
