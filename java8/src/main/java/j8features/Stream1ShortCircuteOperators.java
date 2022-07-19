package j8features;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream1ShortCircuteOperators {

	public static void main(String[] args) {

		/*
		 
		 */

		Optional<Integer> firstEvenObj=Stream.of(1,2,3,4,5,6).filter(x->x%2==0).findFirst();
		if(firstEvenObj.isPresent())
			System.out.println("1st Even number:"+firstEvenObj.get());

		
		Optional<Integer> evenObj=Stream.of(1,2,3,4,5,6).filter(x->x%2==0).findAny();
		if(evenObj.isPresent())
			System.out.println("Even number:"+evenObj.get());

		boolean allMatch=Stream.of(1,2,3,4,5,6).allMatch(x->x%2==0);
		boolean anyMatch=Stream.of(1,2,3,4,5,6).anyMatch(x->x%2==0);
		boolean nonMatch=Stream.of(1,2,3,4,5,6).noneMatch(x->x%2==0);
		
		System.out.println(allMatch+"===="+anyMatch+"===="+nonMatch);
		


	}

}
