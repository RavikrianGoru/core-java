package in.rk.mapstruct.mapper;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import in.rk.mapstruct.dto.Project;

@Mapper(componentModel = "java",
		unmappedSourcePolicy = ReportingPolicy.WARN,
		unmappedTargetPolicy = ReportingPolicy.WARN,
		nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
		collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
		)
public interface ProjectMapper {
	ProjectMapper INSTACE=Mappers.getMapper(ProjectMapper.class);
	
	//All fields and types are same. So no mapping required.
	Project fromEntity(in.rk.mapstruct.entity.Project projEntity);

	@InheritInverseConfiguration
	in.rk.mapstruct.entity.Project fromDto(Project projDto);
}
