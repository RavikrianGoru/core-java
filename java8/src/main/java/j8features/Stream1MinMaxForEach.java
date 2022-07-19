package j8features;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

public class Stream1MinMaxForEach {

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

		Optional<Integer> minElement=al.stream().min((x,y)->x>y?1:x<y?-1:0);
		System.out.println(minElement +"-----"+ minElement.get());

		Optional<Integer> maxElement=al.stream().max((x,y)->x>y?1:x<y?-1:0);
		System.out.println(maxElement +"-----"+ maxElement.get());
		
		Consumer<Integer> c= i->{ System.out.println(i+"---"+(i*i));};
		al.stream().forEach(System.out::println);
		al.stream().forEach(c);
	}

}
