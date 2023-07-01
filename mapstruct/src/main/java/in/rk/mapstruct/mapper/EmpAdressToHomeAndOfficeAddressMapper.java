package in.rk.mapstruct.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.dto.Employee;
import in.rk.mapstruct.dto.HomeAddress;
import in.rk.mapstruct.dto.OfficeAddress;
import in.rk.mapstruct.entity.EmpAddress;

@Mapper(componentModel = "java")
public interface EmpAdressToHomeAndOfficeAddressMapper {
	EmpAdressToHomeAndOfficeAddressMapper INSTANCE = Mappers.getMapper(EmpAdressToHomeAndOfficeAddressMapper.class);

	//0: seems this is not required.
	@Mapping(source = "homeAddrDto.houseNo", target = "houseNo1")
	@Mapping(source = "homeAddrDto.city", target = "city1")
	@Mapping(source = "homeAddrDto.state", target = "state1")
	@Mapping(source = "homeAddrDto.pinCode", target = "pinCode1")
	@Mapping(source = "officeAddrDto.houseNo", target = "houseNo2")
	@Mapping(source = "officeAddrDto.city", target = "city2")
	@Mapping(source = "officeAddrDto.state", target = "state2")
	@Mapping(source = "officeAddrDto.pinCode", target = "pinCode2")
	EmpAddress mapHomeOfficeAddrToEmpAddr(HomeAddress homeAddrDto, OfficeAddress officeAddrDto);
	
	//We can not use @InheritInverseConfiguration as return has only one class type
	//1
	@Mapping(source = "empAddr.houseNo1", target = "houseNo")
	@Mapping(source = "empAddr.city1", target = "city")
	@Mapping(source = "empAddr.state1", target = "state")
	@Mapping(source = "empAddr.pinCode1", target = "pinCode")
	HomeAddress mapEmpAddrToHomeAdrr(EmpAddress empAddr);
	//2
	@Mapping(source = "empAddr.houseNo2", target = "houseNo")
	@Mapping(source = "empAddr.city2", target = "city")
	@Mapping(source = "empAddr.state2", target = "state")
	@Mapping(source = "empAddr.pinCode2", target = "pinCode")
	OfficeAddress mapEmpAddrToOfficeAdrr(EmpAddress empAddr);
	
	//3 map Employee to EmpAddress: This updtated in EmployeeMapper
	@Mapping(source = "empDto.homeAddress.houseNo", target = "houseNo1")
	@Mapping(source = "empDto.homeAddress.city", target = "city1")
	@Mapping(source = "empDto.homeAddress.state", target = "state1")
	@Mapping(source = "empDto.homeAddress.pinCode", target = "pinCode1")
	@Mapping(source = "empDto.officeAdddress.houseNo", target = "houseNo2")
	@Mapping(source = "empDto.officeAdddress.city", target = "city2")
	@Mapping(source = "empDto.officeAdddress.state", target = "state2")
	@Mapping(source = "empDto.officeAdddress.pinCode", target = "pinCode2")
	EmpAddress mapEmployeeToEmpAddr(Employee empDto);
	
	
}
