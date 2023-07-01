package in.rk.mapstruct.mapper;

import org.mapstruct.EnumMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.entity.EmpType;

@Mapper(componentModel = "java")
public interface EmpTypeEnumMapper {
	
	EmpTypeEnumMapper INSTANCE=Mappers.getMapper(EmpTypeEnumMapper.class);
	
	
	@EnumMapping(nameTransformationStrategy = "suffix", configuration = "_SHIFT")
	EmpType from(in.rk.mapstruct.dto.EmpType empTypeDto);
	
	@InheritInverseConfiguration
	in.rk.mapstruct.dto.EmpType from(EmpType empTypeEntity);

}
