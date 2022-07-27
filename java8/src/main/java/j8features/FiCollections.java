package j8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2)
			return -1;
		else if (o1 > 02)
			return +1;
		else
			return 0;
	}

}

public class FiCollections {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(150);
		al.add(70);
		al.add(5);
		al.add(100);
		Collections.sort(al,new MyComparator());
		System.out.println(al);

		//FI-Lambda Expression
		Collections.sort(al,(a,b)->{return a<b?1:-1;});
		System.out.println("All elements from list after sorting");
		al.forEach(System.out::println);

		//print only even numbers
		System.out.println("Print even numbers only");
		al.stream().filter(x->x%2==0).collect(Collectors.toList()).forEach(System.out::println);
		//al.stream().filter(a->a%2==0).forEach(System.out::println);
		
	}

}
