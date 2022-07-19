package j8features.interview.qtns;


@FunctionalInterface
interface MultiplyInterface
{
	int multiply(int a, int b);
}
public class MultipleTwoNumbersFI {

	public static void main(String[] args) {
		
		MultiplyInterface mf=(a,b)->a*b;
		System.out.println(mf.multiply(2, 6));
	}

}
