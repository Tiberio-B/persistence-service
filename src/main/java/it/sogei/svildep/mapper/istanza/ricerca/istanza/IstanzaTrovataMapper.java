package it.sogei.svildep.mapper.istanza.ricerca.istanza;

import it.sogei.svildep.dto.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import it.sogei.svildep.mapper.istanza.IstanzaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaTrovataMapper implements EntityToDtoMapper<Istanza, IstanzaTrovataDto> {

    private final IstanzaMapper istanzaMapper;

    @Override
    public IstanzaTrovataDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaTrovataDto dto = (IstanzaTrovataDto) istanzaMapper.mapEntityToDtoImpl(entity);
        return dto;
    }
}
