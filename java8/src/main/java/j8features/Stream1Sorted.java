package j8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1Sorted {

	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<>();
		al.add(2);
		al.add(25);
		al.add(12);
		al.add(7);
		al.add(8);
		al.add(67);
		al.add(2);
		al.add(87);
		al.add(56);
		al.add(4);
		System.out.println(al);
		
		List<Integer> naturalSortedList=al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted:"+naturalSortedList);
		
		List<Integer> customSortedList=al.stream().sorted((x,y)->x>y?-1:x<y?1:0)
				.collect(Collectors.toList());
		System.out.println("Custome sorted:"+customSortedList);
	}

}
