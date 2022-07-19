package j8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class ConciseCode{

	
	public static void main(String[] args) {

		Function<String,Integer> fun1=s->s.length();
		System.out.println("Length of \"ravi\": "+fun1.apply("ravi"));

		Function<Integer, Integer> fun2=i->i*i;
		System.out.println("Square of 4= "+fun2.apply(4));
		
		Predicate<Integer> predicate=i->i%2==0;
		System.out.println("Is even 5= "+predicate.test(5));

	}

}
