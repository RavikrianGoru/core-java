package in.rk.classloader;
public class ClassLoaderTest 
{

	public static void main(String[] args) 
	{
		
		/*
		 ClassLoader is a java class that is used to load a class into JVM (java virtual machine).
		 
		 It works on delegation principle.
		 1) BootStracp CL ------> loads from rt.jar
		 	|
		 2) Extension CL implements java.lang.ClassLoader ----> loads from lib/ext
		 	|
		 3) System/Application CL implements java.lang.ClassLoader ----> loads from classpath
		 
		 Two rules of ClassLoader in Java are delegation and visibility. 
		 ---------------------------------------------------------------
		 i) Where a request to load a class is a delegate to the parent class loader 
		    before any attempt to load the class.  If a parent doesn't find the class in its specified location like CLASSPATH, 
		    the current Classloader searches for that class on its designated source and loads that Class.
		 
		 ii) A class loaded by a parent is visible to All its child Classloaders but any class loaded by child ClassLoader 
		     is not visible to any parent ClassLoader and an attempt to load a particular class which is only visible to Child
		     will result in java.lang.NoClassDefFoundError in Java
		 
		 
		 
		 
		 
		 */
		
		//Boostrap class loader
		System.out.println("HashMaps class loader:"+java.util.HashMap.class.getClassLoader());
		System.out.println("String class loader:"+java.lang.String.class.getClassLoader());

		//ExtClassLoader
		//load any class from ext/*.jar file
		
		//System/App ClassLoader
		System.out.println("SystemClassLoader:"+ClassLoaderTest.class.getClassLoader());
	}

}
