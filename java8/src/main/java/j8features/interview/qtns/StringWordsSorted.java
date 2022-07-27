package j8features.interview.qtns;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringWordsSorted {

	public static void main(String[] args) {

		String input="Interview, Bit, Ravi, Hello, -2,6,-1,9,3,2,5,44";
		String output=Stream.of(input.split(",")).map(x->x.trim()).sorted().collect(Collectors.joining(","));
		System.out.println(output);
	}

}
