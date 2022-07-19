package j8features;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream1findAnyfindAll {

	public static void main(String[] args) {

		OptionalInt findAny = IntStream.range(1, 11).parallel().findAny();
		System.out.println("FindAny:" + findAny);
		
		OptionalInt findFirst = IntStream.range(5, 50).findFirst();
		System.out.println("FindFirst:" + findFirst);

	}

}
