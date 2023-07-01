package in.rk.mapstruct.mapper;

import java.util.UUID;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.entity.Employee;

@Mapper(componentModel = "java",
		unmappedSourcePolicy = ReportingPolicy.WARN,
		unmappedTargetPolicy = ReportingPolicy.WARN,
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
		collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
		uses= {	EmpGradeEnumMapper.class, 
				EmpTypeEnumMapper.class, 
				EmpAdressToHomeAndOfficeAddressMapper.class, 
				SGD_INRConvertMapper.class,
				ProjectMapper.class,//Not required
				CarModelToTypeMapper.class//Not required
				},
		imports= {UUID.class}

		)
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

	//I- DTO to Model mapping
	@Mapping(source = "empDTO.name" , target = "empName")
	@Mapping(source = "empDTO.empMainStream.name" , target = "empMainStream")
	@Mapping(source = "empDTO" , target = "empAddress")//Ref EmpAdressToHomeAndOfficeAddressMapper: 3 , Target property "empAddress" must not be mapped more than once.
	@Mapping(source = "splPay", target = "splPay", numberFormat = "$#.00")
	@Mapping(source = "empSal_SGD", target = "empSal_INR", qualifiedByName = "sgdToInr") //Ref SGD_INRConvertMapper
	@Mapping(source = "bonus", target = "bonus", qualifiedBy = SgdToInrConverter.class) //Ref SGD_INRConvertMapper
	@Mapping(target="employer", constant = "Amazon Ind")//Constant value even we set or not.
	@Mapping(target="pfType", constant = "Trust")//Constant value even we set or not.
	@Mapping(source="noOfPFs", target = "noOfPFs", defaultValue = "1")//// Assign some default value during mapping if value is null
	// Assign some default value during mapping if value is null
	//import java.util.UUID, imports ="UUID.class" in @Mapper
	@Mapping(source="transactionId", target = "transactionId", defaultExpression ="java(UUID.randomUUID().toString())")
	@Mapping(source="transaction.totalInCents", target = "transaction.total")
	@Mapping(source = "joiningDate", target = "joiningDate", dateFormat = "dd.MM.yyyy")
	@Mapping(target = "fee", expression = "java(additionalFee(empDTO.getFee()))")
	public Employee fromDto(in.rk.mapstruct.dto.Employee empDTO);

	
	
	
	//II- Model to DTO mapping with @InheritInverseConfiguration
	@InheritInverseConfiguration
	@Mapping(source = "empEntity.empAddress" , target = "homeAddress")//Ref EmpAdressToHomeAndOfficeAddressMapper: 1
	@Mapping(source = "empEntity.empAddress" , target = "officeAdddress")//Ref EmpAdressToHomeAndOfficeAddressMapper: 2
	@Mapping(source = "splPay", target = "splPay", numberFormat = "$#.00")
	@Mapping(source = "empSal_INR", target = "empSal_SGD", qualifiedByName = "inrToSgd") //Ref SGD_INRConvertMapper
	@Mapping(source = "bonus", target = "bonus", qualifiedBy = InrToSgdConverter.class) //Ref SGD_INRConvertMapper.
	@Mapping(target="employer", constant = "Amazon Ind")//Constant value even we set or not.
	@Mapping(target="pfType", constant = "Trust")//Constant value even we set or not.
	@Mapping(target = "fee", expression = "java(discountFee(empEntity.getFee()))")
	public in.rk.mapstruct.dto.Employee fromEntity(Employee empEntity);

	
	default Long additionalFee(Long fee)
	{
		if(fee==null)
		{
			return 0l;
		}
		return fee +100;
	}
	default Long discountFee(Long fee)
	{
		if(fee==null)
		{
			return 0l;
		}
		return fee -100;
	}
	
}
