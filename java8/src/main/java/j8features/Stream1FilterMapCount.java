package j8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream1FilterMapCount {

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(12);
		al.add(21);
		al.add(54);
		al.add(720);
		al.add(1020);
		al.add(83);
		al.add(18);
		
		System.out.println(al);
		
		System.out.println("===================.stream().filter(-)=================");
		List<Integer> evenList=al.stream().filter(x->x%2==0).collect(Collectors.toList());
		Set<Integer>  oddSet=al.stream().filter(x->x%2!=0).collect(Collectors.toSet());
		Map<Integer,Integer> map=al.stream().filter(x->x%10!=0).collect(Collectors.toMap(x->x, x->x+10));
		
		System.out.println(evenList);
		System.out.println(oddSet);
		System.out.println(map);

		List<Integer> squareList=al.stream().map(x->x*x).collect(Collectors.toList());
		// similarly Set,Map....etc
		System.out.println(squareList);
		

		long evenCount =al.stream().filter(x->x%2==0).count();
		System.out.println("Count odeven numbers: "+evenCount);
		
	}

}
