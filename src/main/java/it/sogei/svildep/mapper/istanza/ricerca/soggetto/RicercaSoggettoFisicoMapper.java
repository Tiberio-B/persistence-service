package it.sogei.svildep.mapper.istanza.ricerca.soggetto;

import it.sogei.svildep.dto.ricerca.soggetto.RicercaSoggettoFisicoDto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class RicercaSoggettoFisicoMapper implements DtoToEntityMapper<SoggettoFisico, RicercaSoggettoFisicoDto> {

    private final RicercaSoggettoMapper ricercaSoggettoMapper;

    @Override
    public SoggettoFisico mapDtoToEntityImpl(RicercaSoggettoFisicoDto dto) throws RuntimeException {
        Soggetto soggetto = ricercaSoggettoMapper.mapDtoToEntity(dto);
        SoggettoFisico entity = new SoggettoFisico();
        entity.setSoggetto(soggetto);
        entity.setCognome(dto.getCognome());
        entity.setNome(dto.getNome());
        entity.setDataNascita(LocalDate.parse(dto.getDataNascita()));
        return entity;
    }
}


