package in.rk.mapstruct.dto;

import java.util.Collection;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Employee {
	
	private String id; //same type and names: no @Mapping required.
	private String name;//same type but names are different: @Mapping (source="", target="") required.
	
	private EmpGrade empGrade; // same name but types are different : External Mapping is required. Ref:  EmpGradeEnumMapper
	private EmpType empType;// same name but types are different : External Mapping is required. Ref:  EmpTypeEnumMapper
	
	private EmpMainStream empMainStream; // same name but types are different :String <--> EmpMainStream.String

	private HomeAddress homeAddress;// Mapping Multiple Objects: empAddress <-->(homeAddress,officeAdddress) Ref: EmpAdressToHomeAndOfficeAddressMapper
	private OfficeAddress officeAdddress;// Mapping Multiple Objects: empAddress <-->(homeAddress,officeAdddress) Ref: EmpAdressToHomeAndOfficeAddressMapper
	
	private String varPay;//same name but type is different :auto conversions applicable : no mapper is required.
	private double splPay;//same name,type but format t be updated
	private double empSal_SGD;// name & types are different and required some calculation logic. Ref:SGD_INRConvertMapper, @Named(-), qualifiedByName attribute in EmployeeMapper
	private double bonus;//required some calculation logic. Ref: SGD_INRConvertMapper, @Named(-), qualifiedBy attribute in EmployeeMapper
	
	private String employer;// same name & type: assign some constant value during mapping. 
	private String pfType;// same name & type: assign some constant value during mapping. 
	private Integer noOfPFs;// same name & type: assign some default value during mapping. 
	private String transactionId;// same name & type: execute some expression & set value during mapping.
	private Transaction transaction;
	
	private String joiningDate;//same name but different type with dateFormat
	private Collection<Project> onGoingProjects;
	
	private CarModel type;//Name same buttype different 
	
	
	private String empFirstName; //unmappedSourcePolicy = ReportingPolicy.WARN,unmappedTargetPolicy = ReportingPolicy.WARN,

	private Long fee;
}
