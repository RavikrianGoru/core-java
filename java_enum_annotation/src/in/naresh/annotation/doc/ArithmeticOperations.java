package in.naresh.annotation.doc;
/** 
 * Perform Arithmetic operations like sum, mul, sub, div.... etc
 * 
 * @author RK.GORU
 *
 * @since 1.0
 * @see java.lang.Math
 * 
 */

public class ArithmeticOperations {

	/**
	 * <b><i>Perform sum operation</i></b>
	 * @param a first parameter takes int value 
	 * @param b second parameter takes int value
	 * @return sum of two numbers
	 */
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	/**
	 * <b><i>Perform sub operation</i></b>
	 * @param a first parameter takes int value
	 * @param b second parameter takes int value
	 * @return sub of two numbers
	 */
	public int sub (int a, int b)
	{
		return a-b;
	}
}


// cmd> javadoc ArithmeticOperations.java