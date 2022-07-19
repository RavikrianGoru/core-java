package j8features;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1sum_peek_reduce_distinct {

	public static void main(String[] args) {

		int sum =IntStream.of(1,4,6,3,7,9,4,8,10,24,64,2).sum();
		System.out.println("Find sum of stream elemeny by sum():"+sum);

		System.out.println("Find sum of elements from stream by using reduce(-) or reduce(-,-)");
		OptionalInt oint=IntStream.of(1,4,6,3,7,9,4,8,10,24,64,2).reduce((x,y)-> x+y);
						oint.ifPresent(System.out::println);

		int oint1=IntStream.of(1,4,6,3,7,9,4,8,10,24,64,2).reduce(0,(x,y)-> x+y);
		oint1=IntStream.of(1,4,6,3,7,9,4,8,10,24,64,2).reduce(0,Integer::sum);
		oint1=IntStream.of(1,4,6,3,7,9,4,8,10,24,64,2).reduce(0,Integer::sum);
		System.out.println(oint1);
		
		System.out.println("Find unique string from stream by using distinct()");
		Stream.of("Ravi", "kave","Devi","Ravi", "Devi", "Chandu", "Durga").distinct().forEach(System.out::println);

		IntStream.range(1, 11)
				 .filter(x->x%2==0)
				 .peek(System.out::println)
				 .map(x->x*x)
				 .forEach(System.out::println);
		
		
		
	}

}
