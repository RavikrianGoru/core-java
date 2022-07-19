package j8features;

/*

1) Functional interface: An interface with exactly one abstract method.
	it can have one or more public default, static methods.
 	* We should use @FunctionalInterface annotation at class level.-recommended not mandatory
	* Used for functional programming, labda expression, method references.
	* we can declare java java.lang.Object class methods as abstract methods.

*/
@FunctionalInterface
interface FiReadable
{
	abstract void readData(String data);
}

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		//Lambda Expression
		FiReadable fiObj1=(d)->{System.out.println(d);};
		fiObj1.readData("Hello World");
	}

}
