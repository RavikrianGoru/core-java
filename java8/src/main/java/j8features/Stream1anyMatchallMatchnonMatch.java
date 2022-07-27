package j8features;

import java.util.stream.IntStream;

public class Stream1anyMatchallMatchnonMatch {

	public static void main(String[] args) 
	{
		
		boolean anyMatchPositive = IntStream.range(1, 11).anyMatch(x -> x == 5);
		System.out.println("1-10 elemements stream-> anyMatch ==5 =" + anyMatchPositive);
		boolean anyMatchNegative = IntStream.range(1, 11).anyMatch(x -> x == 20);
		System.out.println("1-10 elemements stream-> anyMatch ==20 =" + anyMatchNegative);

		boolean allMatchPositive = IntStream.range(1, 11).allMatch(x -> x > 10);
		System.out.println("1-10 elemements stream->allMatch >10 =" + allMatchPositive);
		boolean allMatchNegative = IntStream.range(1, 11).allMatch(x -> x < 20);
		System.out.println("1-10 elemements stream->allMatch <20 =" + allMatchNegative);
		
		boolean nonMatchPositive = IntStream.range(1, 11).noneMatch(x->x==50);
		System.out.println("1-10 elemements stream->nonMatch =50 =" + nonMatchPositive);
		boolean nonMatchNegative = IntStream.range(1, 11).noneMatch(x->x==5);
		System.out.println("1-10 elemements stream->nonMatch =5 =" + nonMatchNegative);
		
	}

}
