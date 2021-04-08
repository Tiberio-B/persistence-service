package it.sogei.svildep.mapper;


import it.sogei.svildep.entity.base.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public interface EntityToDtoMapper<E extends BaseEntity, D> {

    D mapEntityToDtoImpl(E entity);

    default D mapEntityToDto(E entity) {
        if (entity == null) return null;
        D dto = mapEntityToDtoImpl(entity);
        return dto;
    }

    default List<D> mapEntityToDto(List<E> entities) {
        if (entities == null) return null;
        List<D> dtos = new ArrayList<>();
        for (E entity : entities) dtos.add(mapEntityToDto(entity));
        return dtos;
    }

}
