package it.sogei.svildep.mapper.common;

import it.sogei.svildep.dto.common.NascitaDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import org.springframework.stereotype.Component;

@Component
public class NascitaMapper {

    public NascitaDto mapEntityToDto(SoggettoFisico entity) {
        NascitaDto nascitaDto = new NascitaDto();
        if (entity.getComuneNascita() != null) {
            nascitaDto.setComune(entity.getComuneNascita().getDenominazioneComune());
            nascitaDto.setProvincia(entity.getComuneNascita().getProvincia().getDenominazioneProvincia());
        }
        else if (entity.getStatoEsteroNascita() != null) {
            nascitaDto.setStatoEstero(entity.getStatoEsteroNascita().getDenominazioneStatoEstero());
        }
        return nascitaDto;
    }
}
