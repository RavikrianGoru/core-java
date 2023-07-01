package in.rk.mapstruct.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.entity.EmpGrade;

@Mapper(componentModel = "java")
public interface EmpGradeEnumMapper {

	EmpGradeEnumMapper INSTANCE = Mappers.getMapper(EmpGradeEnumMapper.class);

	@ValueMappings({
		@ValueMapping(source = "A", target = "GRADE_A"),
		@ValueMapping(source = "B", target = "GRADE_B"),
		@ValueMapping(source = "C", target = "GRADE_C"),
		@ValueMapping(source = MappingConstants.ANY_REMAINING, target = "GRADE_D"),
		@ValueMapping(source = MappingConstants.NULL,target = "GRADE_E")
		
	})
	public EmpGrade from(in.rk.mapstruct.dto.EmpGrade empGradeDTO);
	
	
	@InheritInverseConfiguration
	@ValueMappings({
		@ValueMapping(source = "GRADE_D", target="D"),
		@ValueMapping(source = "GRADE_E", target=MappingConstants.NULL),
		@ValueMapping(source = MappingConstants.ANY_REMAINING, target="D")
	})
	public in.rk.mapstruct.dto.EmpGrade from (EmpGrade empGradeEntity);
	

}
