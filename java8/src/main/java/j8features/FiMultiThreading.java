package j8features;

import java.util.concurrent.Callable;

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) { System.out.println("MyRunnable");};
	}
	
}

class MyCallable implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		for(int i=1;i<=10;i++) { System.out.println("MyCallable");};
		return 100;
	}
	
}

public class FiMultiThreading {

	public static void main(String[] args) 
	{
		
		Thread t = new Thread(new MyRunnable());
		t.start();
		//FI-Lambda Expression
		Runnable r=()->{ for(int i=1;i<=10;i++) {System.out.println("FI runnable");}};
		Thread t1 = new Thread(r);
		t1.start();
		
		
		MyCallable c=new MyCallable();
		try {
			System.out.println(c.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		//FI-Lambda Expression
		Callable<Integer> c1=()->{
			for(int i=0;i<=9;i++)
			{
				System.out.println("FI callable");
			}
			return 50;
		};
		try {
			System.out.println(c1.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

