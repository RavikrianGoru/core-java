package j8features.interview.qtns;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNoOfOccurnaceOfWordInString {

	public static void main(String[] args) {
		String data= "This is ravi , and ravi is good boy and bobo";
		

		Map<String, Long> map=Stream.of(data.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
	}
		
}
