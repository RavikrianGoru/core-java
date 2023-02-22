package in.nareshit;

import in.nareshit.pojo.Employee;
import in.nareshit.pojo.Student;
import in.nareshit.pojo.StudentUtility;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("RK");
		emp.setEsal(150000d);
		System.out.println(emp);
	
		
		Student s= Student.builder().sid(100).sname("SS").savg(76.7d).build();
		System.out.println(s);
		
		
		StudentUtility.demoVar();
		StudentUtility.demoVal();
		
		StudentUtility.demoNonNull(100, "Ravi", 1000.0, s);
		StudentUtility.demoNonNull(103, "Ravi", null, s);
		
		//StudentUtility.demoNonNull(null, "Ravi", 1000.0, s);
		//StudentUtility.demoNonNull(101, null, 1000.0, s);
		//StudentUtility.demoNonNull(104, "Ravi", 1000.0, null);
		
		StudentUtility.demoCleanup();
		
		StudentUtility.demoBuilder();
		
		
	}

}
