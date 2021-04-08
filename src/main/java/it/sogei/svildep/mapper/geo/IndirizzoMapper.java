package it.sogei.svildep.mapper.geo;

import it.sogei.svildep.dto.geo.IndirizzoDto;
import it.sogei.svildep.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IndirizzoMapper implements Mapper<Indirizzo, IndirizzoDto> {

    @Override
    public IndirizzoDto mapEntityToDtoImpl(Indirizzo entity) {
        IndirizzoDto dto = new IndirizzoDto();
        dto.setDescrizioneIndirizzo(entity.getIndirizzo());
        dto.setNumCivico(entity.getCivico());
        return dto;
    }

    @Override
    public Indirizzo mapDtoToEntityImpl(IndirizzoDto dto) {
        Indirizzo entity = new Indirizzo();
        entity.setIndirizzo(dto.getDescrizioneIndirizzo());
        entity.setCivico(dto.getNumCivico());
        return entity;
    }
}
