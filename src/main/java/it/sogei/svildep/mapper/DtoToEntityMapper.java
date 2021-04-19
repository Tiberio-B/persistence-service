package it.sogei.svildep.mapper;

import it.sogei.svildep.dto.SvildepDto;
import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.exception.SvildepException;

import java.util.ArrayList;
import java.util.List;

public interface DtoToEntityMapper<E extends BaseEntity, D extends SvildepDto> {

    E mapDtoToEntityImpl(D dto) throws RuntimeException;

    default E mapDtoToEntity(D dto) throws SvildepException {
        if (dto == null) return null;
        E entity;
        try { entity = mapDtoToEntityImpl(dto);
        } catch (RuntimeException ex) { throw new SvildepException(ex); }
        return entity;
    }

    default List<E> mapDtoToEntity(List<D> dtos) throws SvildepException {
        if (dtos == null) return null;
        List<E> entities = new ArrayList<>();
        for (D dto : dtos) entities.add(mapDtoToEntity(dto));
        return entities;
    }

}
