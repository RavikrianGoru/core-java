package in.rk.mapstruct.helpers;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;

import in.rk.mapstruct.dto.CarModel;
import in.rk.mapstruct.dto.EmpMainStream;
import in.rk.mapstruct.dto.HomeAddress;
import in.rk.mapstruct.dto.OfficeAddress;
import in.rk.mapstruct.dto.Project;
import in.rk.mapstruct.dto.Transaction;
import in.rk.mapstruct.entity.CarType;
import in.rk.mapstruct.entity.EmpAddress;
import in.rk.mapstruct.entity.EmpGrade;
import in.rk.mapstruct.entity.EmpType;
import in.rk.mapstruct.entity.Employee;

public final class EmployeeHelper {

	private EmployeeHelper() {
		// to hide default implementation
	}

	public static Employee getEmployeeEntity() {
		
		in.rk.mapstruct.entity.Project p1 =in.rk.mapstruct.entity.Project.builder()
				.name("p1")
				.startDate(LocalDate.now())
				.budget(1500000.00)
				.size(10)
				.build();
		in.rk.mapstruct.entity.Project p2 =in.rk.mapstruct.entity.Project.builder()
				.name("p2")
				.startDate(LocalDate.now())
				.budget(2500000.00)
				.size(20)
				.build();
		ArrayList<in.rk.mapstruct.entity.Project> alProj=new ArrayList<>();
		alProj.add(p1);
		alProj.add(p2);

		return Employee.builder()
				.id("id_001")
				.empName("ravi")
				.empGrade(EmpGrade.GRADE_D)
				.empType(EmpType.DAY_SHIFT)
				.empMainStream("Java")
				.empAddress(EmpAddress.builder()
						.houseNo1("h1")
						.city1("c1")
						.state1("s1")
						.pinCode1("p1")
						.houseNo2("h2")
						.city2("c2")
						.state2("s2")
						.pinCode2("p2")
						.build())
				.varPay(20000.00)
				.splPay("$1000.50")
				.empSal_INR(2000000)
				.bonus(50000)
				.employer("Amazon Ind 1")
				.pfType("Trust 1")
				//.noOfPFs(2)
				.transaction(in.rk.mapstruct.entity.Transaction.builder()
						.id(1234567890L)
						.uuid("ABC12346790")
						.total(new BigInteger("99999999990"))
						.build())
				.joiningDate(LocalDate.now())
				.onGoingProjects(alProj)
				.type(CarType.builder().model("M1").build())
				.empLastName("LastName")
				.fee(500l)
				.build();
	}

	public static in.rk.mapstruct.dto.Employee getEmployeeDto()
	{
		
		Project p1 =Project.builder()
				.name("p1")
				.startDate(LocalDate.now())
				.budget(1500000.00)
				.size(10)
				.build();
		Project p2 =Project.builder()
				.name("p2")
				.startDate(LocalDate.now())
				.budget(2500000.00)
				.size(20)
				.build();
		ArrayList<Project> alProj=new ArrayList<>();
		alProj.add(p1);
		alProj.add(p2);
		return in.rk.mapstruct.dto.Employee.builder()
					.id("id_001")
					.name("ravi")
					.empGrade(in.rk.mapstruct.dto.EmpGrade.D)
					.empType(in.rk.mapstruct.dto.EmpType.DAY)
					.empMainStream(EmpMainStream.builder().name("Java").build())
					.homeAddress(HomeAddress.builder()
							.houseNo("h1")
							.city("c1")
							.state("s1")
							.pinCode("p1")
							.build())
					.officeAdddress(OfficeAddress.builder()
							.houseNo("h2")
							.city("c2")
							.state("s2")
							.pinCode("p2")
							.build())
					.varPay("300000.00")
					.splPay(12345)
					.empSal_SGD(8000)
					.bonus(1000)
					.employer("Amazon Ind 1")
					.pfType("Trust 1")
					//.noOfPFs(2)
					.transaction(Transaction.builder()
									.uuid("ABC1234567890")
									.totalInCents(25000L)
									.build()
							)
					.joiningDate("26.01.1992")
					.onGoingProjects(alProj)
					.type(CarModel.builder().model("M2").build())
					.empFirstName("FirstName")
					.fee(20l)
					.build();
	}

}
