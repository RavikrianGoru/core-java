package j8features;

import java.util.Arrays;
import java.util.List;

public class Stream1limit_skip {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,4,2,3,6,7,3,4,6,2,59);
		list.stream()
			.sorted((x,y)->x<y?1:x>y?-1:0)
			.limit(5)
			.skip(4)
			.forEach(System.out::println);
	}

}
