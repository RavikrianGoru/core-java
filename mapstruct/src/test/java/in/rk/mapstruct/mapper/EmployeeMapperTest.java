package in.rk.mapstruct.mapper;


import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import in.rk.mapstruct.dto.EmpMainStream;
import in.rk.mapstruct.dto.Employee;
import in.rk.mapstruct.dto.HomeAddress;
import in.rk.mapstruct.dto.OfficeAddress;
import in.rk.mapstruct.entity.EmpAddress;
import in.rk.mapstruct.entity.EmpGrade;
import in.rk.mapstruct.entity.EmpType;
import in.rk.mapstruct.helpers.EmployeeHelper;

class EmployeeMapperTest {

	@Test
	void testFromEmployeeDto() throws IOException{
		Employee eDto1=EmployeeHelper.getEmployeeDto();
		in.rk.mapstruct.entity.Employee eEntity=EmployeeMapper.INSTANCE.fromDto(eDto1);
		Employee eDto2=EmployeeMapper.INSTANCE.fromEntity(eEntity);
		System.out.println(eDto1);
		System.out.println(eEntity);
		System.out.println(eDto2);
		Assertions.assertEquals(eDto2.getId(), eDto1.getId());
		Assertions.assertEquals(eDto2.getName(), eDto1.getName());
		Assertions.assertEquals(eDto2.getEmpGrade(), eDto1.getEmpGrade());
		Assertions.assertEquals(eDto2.getEmpType(), eDto1.getEmpType());
		Assertions.assertEquals(eDto2.getEmpMainStream(), eDto1.getEmpMainStream());
		Assertions.assertEquals(eDto2.getHomeAddress(), eDto1.getHomeAddress());
		Assertions.assertEquals(eDto2.getOfficeAdddress(), eDto1.getOfficeAdddress());
		Assertions.assertEquals(eDto2.getSplPay(), 12345.0);
		Assertions.assertEquals(eDto2.getEmpSal_SGD(), eDto1.getEmpSal_SGD());
		Assertions.assertEquals(eDto2.getBonus(), eDto1.getBonus());
		Assertions.assertEquals(eDto2.getEmployer(), "Amazon Ind");
		Assertions.assertEquals(eDto2.getPfType(), "Trust");
		Assertions.assertEquals((int)eDto2.getNoOfPFs(), 1);
		Assertions.assertNotNull(eDto2.getTransactionId());
		Assertions.assertEquals(eDto2.getTransaction().getUuid(), eDto1.getTransaction().getUuid());
		Assertions.assertEquals(eDto2.getTransaction().getTotalInCents(), eDto1.getTransaction().getTotalInCents());
		Assertions.assertEquals(eDto2.getJoiningDate(), eDto1.getJoiningDate());
		Assertions.assertEquals(eDto2.getOnGoingProjects(), eDto1.getOnGoingProjects());
		Assertions.assertEquals(eDto2.getType(), eDto1.getType());
		Assertions.assertEquals(eDto2.getFee(), eDto1.getFee());
	}

	@Test
	void testFromEmployeeEntity() throws IOException{
		in.rk.mapstruct.entity.Employee eEntity1=EmployeeHelper.getEmployeeEntity();
		Employee eDTO=EmployeeMapper.INSTANCE.fromEntity(eEntity1);
		in.rk.mapstruct.entity.Employee eEntity2=EmployeeMapper.INSTANCE.fromDto(eDTO);
		System.out.println(eEntity1);
		System.out.println(eDTO);
		System.out.println(eEntity2);
		Assertions.assertEquals(eEntity2.getId(), eEntity1.getId());
		Assertions.assertEquals(eEntity2.getEmpName(), eEntity1.getEmpName());
		Assertions.assertEquals(eEntity2.getEmpGrade(), eEntity1.getEmpGrade());
		Assertions.assertEquals(eEntity2.getEmpType(), eEntity1.getEmpType());
		Assertions.assertEquals(eEntity2.getEmpMainStream(), eEntity1.getEmpMainStream());
		Assertions.assertEquals(eEntity2.getEmpAddress(), eEntity1.getEmpAddress());
		Assertions.assertEquals(eEntity2.getSplPay(), "$1000.50");
		Assertions.assertEquals(eEntity2.getEmpSal_INR(), eEntity1.getEmpSal_INR());
		Assertions.assertEquals(eEntity2.getBonus(), eEntity1.getBonus());
		Assertions.assertEquals(eEntity2.getEmployer(), "Amazon Ind");
		Assertions.assertEquals(eEntity2.getPfType(), "Trust");
		Assertions.assertEquals((int)eEntity2.getNoOfPFs(), 1);
		Assertions.assertNotNull(eEntity2.getTransactionId());
		Assertions.assertEquals(eEntity2.getTransaction().getUuid(), eEntity1.getTransaction().getUuid());
		Assertions.assertEquals(eEntity2.getTransaction().getTotal(), eEntity1.getTransaction().getTotal());
		Assertions.assertEquals(eEntity2.getJoiningDate(), eEntity1.getJoiningDate());
		Assertions.assertEquals(eEntity2.getOnGoingProjects(), eEntity1.getOnGoingProjects());
		Assertions.assertEquals(eEntity2.getType(), eEntity1.getType());
		Assertions.assertEquals(eEntity2.getFee(), eEntity1.getFee());
	}

}
