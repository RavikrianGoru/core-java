package j8features.interview.qtns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateElementsFromIntegerList {

	public static void main(String[] args) {

		System.out.println("-----Duplicate elements----");
		List<Integer> list= Arrays.asList(1,4,2,5,3,4,2,7,9,2,45,6,4,2);
		Set<Integer> set=new HashSet<>();
		list.stream()
			.filter(x->!set.add(x))
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		

		System.out.println("-----distinct elements----");
		IntStream.of(1,4,3,2,43,2,3).distinct().forEach(System.out::println);
	}

}
