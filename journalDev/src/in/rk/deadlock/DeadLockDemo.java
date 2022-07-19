package in.rk.deadlock;

class DThread implements Runnable {
	private Object o1;
	private Object o2;

	DThread(Object o1, Object o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		synchronized (o1) {
			System.out.println(name + "----> locked on --->" + o1);
			workForSometime();
			System.out.println(name + "----> released locked on --->" + o1);
		}
		synchronized (o2) {
			System.out.println(name + "----> locked on --->" + o2);
			workForSometime();
			System.out.println(name + "----> released locked on --->" + o2);
		}
	}

	private void workForSometime() {
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class DeadLockDemo {

		/*
		1) Open JConsole 
		2) Run with Configuration and keep the entry in argument.
		-Dcom.sun.management.jmxremote
		
		
		 */
	public static void main(String[] args) {

		Object resouce1 = new Object();
		Object resouce2 = new Object();
		Object resouce3 = new Object();

		Thread t1 = new Thread(new DThread(resouce1, resouce2));
		Thread t2 = new Thread(new DThread(resouce2, resouce3));
		Thread t3 = new Thread(new DThread(resouce3, resouce1));
		t1.start();
		t2.start();
		t3.start();
	}

}
