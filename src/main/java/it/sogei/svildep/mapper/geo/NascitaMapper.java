package it.sogei.svildep.mapper.geo;

import it.sogei.svildep.dto.geo.NascitaDto;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.entity.gestionesoggetti.StatoEstero;
import org.springframework.stereotype.Component;

@Component
public class NascitaMapper {

    public void daSoggettoFisicoANascitaDto(SoggettoFisico entity) {
        NascitaDto nascitaDto = new NascitaDto();
        if (entity.getComuneNascita() != null) {
            nascitaDto.setComune(entity.getComuneNascita().getDenominazioneComune());
            nascitaDto.setProvincia(entity.getComuneNascita().getProvincia().getDenominazioneProvincia());
        }
        else if (entity.getStatoEsteroNascita() != null) {
            nascitaDto.setStatoEstero(entity.getStatoEsteroNascita().getDenominazioneStatoEstero());
        }
    }

    public void daNascitaDtoASoggettoFisico(NascitaDto dto, SoggettoFisico entity) {
        if (dto.getComune() != null) {
            Comune comune = new Comune();
            comune.setDenominazioneComune(dto.getComune());
            entity.setComuneNascita(comune);
        }
        else if (dto.getStatoEstero() != null) {
            StatoEstero statoEstero = new StatoEstero();
            statoEstero.setDenominazioneStatoEstero(dto.getStatoEstero());
            entity.setStatoEsteroNascita(statoEstero);
        }
    }
}
