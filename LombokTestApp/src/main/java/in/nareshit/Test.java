package in.nareshit;

import in.nareshit.pojo.Employee;
import in.nareshit.pojo.Student;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("RK");
		emp.setEsal(150000d);
		System.out.println(emp);
	
		
		Student s= Student.builder().sid(100).sname("SS").savg(76.7d).build();
		System.out.println(s);
	}

}
