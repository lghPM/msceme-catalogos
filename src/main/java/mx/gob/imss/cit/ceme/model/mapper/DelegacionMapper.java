package mx.gob.imss.cit.ceme.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import mx.gob.imss.cit.ceme.model.entitydto.DelegacionDto;
import mx.gob.imss.cit.ceme.persistence.Delegacion;

@Component
@Mapper(componentModel = "spring")
public interface DelegacionMapper {

	DelegacionMapper INSTANCE = Mappers.getMapper(DelegacionMapper.class);

	Delegacion toEntity(DelegacionDto dto);

	DelegacionDto toDto(Delegacion entity);

	List<DelegacionDto> toLstDto(List<Delegacion> entity);

//	@Mapping(target = "id", source = "id")
//	@Mapping(target = "desDelegacion", source = "desDelegacion")
//	List<DelegacionDto> toLstDtoRec(List<DelegacionRecord> entity);

	List<Delegacion> toLstEntity(List<DelegacionDto> dto);

}
