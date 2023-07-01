package in.rk.mapstruct.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
public class Employee {
	
	private String id; //same type and names: no @Mapping required.
	private String empName;//same type but names are different: @Mapping (source="", target="") required.
	
	private EmpGrade empGrade; // same name but types are different : External Mapping is required. Ref:  EmpGradeEnumMapper
	private EmpType empType;// same name but types are different : External Mapping is required. Ref:  EmpTypeEnumMapper
	
	private String empMainStream; // same name but types are different :String <--> EmpMainStream.String
	private EmpAddress empAddress; // Mapping Multiple Objects: empAddress <-->(homeAddress,officeAdddress) Ref: EmpAdressToHomeAndOfficeAddressMapper
	
	private double varPay;//same name but type is different :auto conversions applicable : no mapping is required.
	private String splPay;//same name & different type type but format t be updated
	private double empSal_INR;// name different and required some calculation logic. Ref: SGD_INRConvertMapper, @Named(-), qualifiedByName attribute in EmployeeMapper 
	private double bonus; //required some calculation logic. Ref: SGD_INRConvertMapper, @Named(-), qualifiedBy attribute in EmployeeMapper
	private String employer;// same name & type: assign some constant value during mapping. 
	private String pfType;// same name & type: assign some constant value during mapping. 
	private Integer noOfPFs;// same name & type: assign some default value during mapping.
	private String transactionId;// same name & type: execute some expression & set value during mapping.
	private Transaction transaction;//Different type & no of fields are different. maps only matched fields. map required fields
	
	private LocalDate joiningDate;//same name but different type with dateFormat
	private List<Project> onGoingProjects;//project name and name is compatible and fields are also same.
	
	private CarType type;//Name same but type different 
	
	private String empLastName; //unmappedSourcePolicy = ReportingPolicy.WARN,unmappedTargetPolicy = ReportingPolicy.WARN,

	private Long fee;
}
