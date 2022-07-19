package j8features;

enum Grads
{
	A,B,C;
	public static void main(String[] args)
	{
		System.out.println("enum Grads  -->main()");
	}
}

interface InteraceOne
{
	public static void main(String[] args)
	{
		System.out.println("Interface InteraceOne -->main()");
	}
}

abstract class AbsClass
{
	public static void main(String[] args)
	{
		System.out.println("abstract AbsClass -->main()");
	}
}


public class JavaMainMethodExecution {

	public static void main(String[] args) {
		System.out.println("JavaMainMethodExecution -->main()");
		System.out.println("We can write and execute main(-) method from class, abstract class, enum, interface from jdk.1.8 onwards.");
	}
}
