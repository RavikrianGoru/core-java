package in.nareshit.annotations;

public class TestAnnotation {

	public static void main(String[] args) {
		ProductProcess.process(FlipkartOrder.class);
		ProductProcess.process(AmazonOrder.class);
	}
}
