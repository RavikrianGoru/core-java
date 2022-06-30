package in.nareshit.enums;

public class TestEnum {

	public static void main(String[] args) {

		Examesult e = Examesult.PASS;
		System.out.println(e);

		Examesult[] arr = Examesult.values();
		for (Examesult eachObj : arr) {
			System.out.println(eachObj+"----"+eachObj.ordinal());
		}
		
		Grades g[] = Grades.values();
		for (Grades eachObj : g) {
			System.out.println(eachObj+"----"+eachObj.ordinal());
		}
		
	}

}
