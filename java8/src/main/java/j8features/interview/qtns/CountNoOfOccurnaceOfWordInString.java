package j8features.interview.qtns;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountNoOfOccurnaceOfWordInString {

	public static void main(String[] args) {
		String data = "This is ravi , and ravi is good boy and bobo, hello ravi";
		System.out.println("How many times each word occurs?");
		Map<String,Long> maP=Stream.of(data.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(maP);
		
		System.out.println();
		System.out.println("Print all unique elements:");
		maP.forEach((k,v)->{if(v==1) System.out.println(k);});
		
		System.out.println("Print all duplicate elements: ");
		maP.forEach((k,v)->{if(v>1) System.out.println(k);});
		
		System.out.println("Print the element max number of times repeated");
		Optional<Entry<String, Long>> max=maP.entrySet().stream().max((e1,e2)->e1.getValue()>e2.getValue()?1:-1);
		System.out.println(max);
		
		
		int [] a1= { 1,2,3,4,4,5,6,7,8,7,4,5,9,10,11,12,13,14,15};
		
		
		System.out.println("Conver to List<Integer>:");
		List<Integer> al = IntStream.of(a1).boxed().collect(Collectors.toList());
		System.out.println(al);
		
		HashSet<Integer> hs = new HashSet();
		System.out.println("Duplicate elements only");
		al.stream().filter(x->!hs.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println("All elements without duplicate/repetation or distinct");
		HashSet<Integer> hs1 = new HashSet();
		al.stream().filter(x->hs1.add(x)).collect(Collectors.toList()).forEach(System.out::println);
		// or		
		//al.stream().distinct().forEach(System.out::println);


		Map<Integer, Long> map=al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		System.out.println("Unique elements only");
		map.forEach((k,v)->{if(v==1) System.out.println(k);});
	}

}
