package j8features;

interface interfaceA
{
	static void m1()
	{
		System.out.println("static-method-m1() from interfaceA");
	}
	static void m2()
	{
		System.out.println("static-method-m2() from interfaceA");
	}

}
class classOne implements interfaceA
{
	static void m1()
	{
		System.out.println("static-method-m1() from classOne ----> method hiding");
	}
}
public class StaticMethodInInterface {

	public static void main(String[] args) 
	{
		interfaceA.m1();
		interfaceA.m2();
		classOne obj =new classOne();
		obj.m1();
		//obj.m2(); compile time error m2() is not available in class.
		
		/*
		Static method:	we can write static method in interface and it can be accessed by interfaceName.methodName() only.  
			As it is class level and it can not be accessed in child classes.
			we can write the same static method in implemented class and access.(method hiding).
			If you want to have all methods to be static methods then better to write in interface as class is costly than interface.
			Ex: all utility will have static methods and should be placed in interface.

		*/
				
		
	}

}
