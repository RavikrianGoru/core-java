package j8features;

interface IntefaceDefaultMethodOne
{
	public void m1();
	default void m2()
	{
		System.out.println("Default method - m2() from IntefaceDefaultMethodOne");
	}
}
interface IntefaceDefaultMethodTwo
{
	public void m1();
	default void m2()
	{
		System.out.println("Default method - m2() from IntefaceDefaultMethodTwo");
	}
}

class ClassA implements IntefaceDefaultMethodOne,IntefaceDefaultMethodTwo
{
	public void m1()
	{
		System.out.println("m1() from ClassA");
	}

	@Override
	public void m2() {
		System.out.println("m2() from ClassA");
	}

}
class ClassB implements IntefaceDefaultMethodOne,IntefaceDefaultMethodTwo
{
	public void m1()
	{
		System.out.println("m1() from ClassB");
	}

	@Override
	public void m2() {
		System.out.println("m2() from ClassB");
	}

}
class ClassC implements IntefaceDefaultMethodOne
{
	public void m1()
	{
		System.out.println("m1() from ClassC");
	}
	
}

public class DefaultMethodsInInterface 
{

	public static void main(String[] args) 
	{
		ClassA aObj=new ClassA();
		aObj.m1();
		aObj.m2();
		ClassB bObj=new ClassB();
		bObj.m1();
		bObj.m2();
		ClassC cObj=new ClassC();
		cObj.m1();
		cObj.m2();
		
		/*
		 Default method: ---> applicable for interface only.
		 	If we want to add new method without effecting any implementation classes then we write default method in interface.
			All implemented class have this default method access.
			Implemented class can override default method with out default keyword.
			we can not write default methods of Object class methods in interface. such as equals(),hashCode(),toString(-)....etc
			If same default method in two interfaces and a class implementing both interfaces then it should override default method else compile time error due to diamond problem.

		 
		 */
	}

}
