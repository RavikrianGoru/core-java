package in.rk.classloader;
public class ClassLoaderTest 
{

	public static void main(String[] args) 
	{
		
		//Boostrap class loader
		System.out.println("HashMaps class loader:"+java.util.HashMap.class.getClassLoader());
		System.out.println("String class loader:"+java.lang.String.class.getClassLoader());

		//ExtClassLoader
		//load any class from ext/*.jar file
		
		//System/App ClassLoader
		System.out.println(ClassLoaderTest.class.getClassLoader());
	}

}
