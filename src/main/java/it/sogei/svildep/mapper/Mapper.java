package it.sogei.svildep.mapper;

import it.sogei.svildep.entity.base.BaseEntity;

public interface Mapper<E extends BaseEntity, D> extends EntityToDtoMapper<E, D>, DtoToEntityMapper<E, D> {

}
