package j8features.interview.qtns;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	static boolean isPrime(int number)
	{
		return number>1 && IntStream.range(2, number).noneMatch(n->number%n==0);
	}
	
	
	public static void main(String[] args) {

		System.out.println("Sqrt of 1st 5 prime numbers");
		Stream.iterate(2, i->i+1)
			  .filter(PrimeNumber::isPrime)
			  .map(Math::sqrt)
			  .limit(5)
			  .forEach(x->System.out.println(""+x));
		
		System.out.println("is 5 prime: "+isPrime(5));
		System.out.println("is 4 prime: "+isPrime(4));
	}

}
