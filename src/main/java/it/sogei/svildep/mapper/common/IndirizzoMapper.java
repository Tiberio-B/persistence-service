package it.sogei.svildep.mapper.common;

import it.sogei.svildep.dto.common.IndirizzoDto;
import it.sogei.svildep.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IndirizzoMapper implements EntityToDtoMapper<Indirizzo, IndirizzoDto> {

    @Override
    public IndirizzoDto mapEntityToDtoImpl(Indirizzo entity) {
        IndirizzoDto dto = new IndirizzoDto();
        dto.setDescrizioneIndirizzo(entity.getIndirizzo());
        dto.setNumCivico(entity.getCivico());
        dto.setTipoIndirizzo(entity.getTipoIndirizzo().getDescrizioneTipoIndirizzo());
        return dto;
    }

}
