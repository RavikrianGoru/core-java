package j8features;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {


		int r= (int) (Math.random() * 10);

		Optional<String> optDesc=Optional.ofNullable("SomeData");
		if(r%3==0)
		{
			optDesc=Optional.ofNullable("Div by 3");
		}else if (r%2==0) {
			
			optDesc=Optional.of("Div By 2");
		}else
		{
			optDesc=Optional.empty();
		}
		
		System.out.println(optDesc);
		if(optDesc.isPresent())
		{
			System.out.println(optDesc.get());
		}
		
		
		
	}

}
