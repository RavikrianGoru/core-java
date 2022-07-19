package j8features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1ToArray {

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
		Integer[] intArray=al.stream().toArray(Integer[]::new);
		
		for(int i =0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}

		System.out.println("-------------Stream.of(-)-----");
		Stream s = Stream.of(9,2,3,5,6);
		s.forEach(System.out::println);

		Integer[] i = {1,2,4,0,9};
		Stream s1=Stream.of(i);
		s1.forEach(System.out::println);
		
		
	}

}
