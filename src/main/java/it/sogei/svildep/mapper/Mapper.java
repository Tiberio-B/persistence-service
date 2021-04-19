package it.sogei.svildep.mapper;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.entity.base.BaseEntity;

public interface Mapper<E extends BaseEntity, D extends SvildepDto> extends EntityToDtoMapper<E, D>, DtoToEntityMapper<E, D> {

}
