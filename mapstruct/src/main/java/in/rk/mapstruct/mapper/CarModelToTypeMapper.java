package in.rk.mapstruct.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.dto.CarModel;
import in.rk.mapstruct.entity.CarType;

@Mapper(componentModel = "java",
unmappedSourcePolicy = ReportingPolicy.WARN,
unmappedTargetPolicy = ReportingPolicy.WARN,
nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
)
public interface CarModelToTypeMapper {
	
	CarModelToTypeMapper INSTANCE=Mappers.getMapper(CarModelToTypeMapper.class);
	
	CarType fromDto(CarModel carModel);
	
	@InheritInverseConfiguration
	CarModel fromEntity(CarType carType);
}
