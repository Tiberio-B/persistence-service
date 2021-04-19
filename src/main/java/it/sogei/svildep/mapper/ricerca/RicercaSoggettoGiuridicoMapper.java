package it.sogei.svildep.mapper.ricerca;

import it.sogei.svildep.dto.ricerca.RicercaIstanzaPerSoggettoGiuridicoDto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RicercaSoggettoGiuridicoMapper implements DtoToEntityMapper<SoggettoGiuridico, RicercaIstanzaPerSoggettoGiuridicoDto> {

    private final RicercaSoggettoMapper ricercaSoggettoMapper;

    public SoggettoGiuridico mapDtoToEntityImpl(RicercaIstanzaPerSoggettoGiuridicoDto dto) {
        Soggetto soggetto = ricercaSoggettoMapper.mapDtoToEntity(dto);
        SoggettoGiuridico entity = new SoggettoGiuridico();
        entity.setSoggetto(soggetto);
        entity.setRagioneSociale(dto.getRagioneSociale());
        entity.setPartitaIVA(dto.getPartitaIva());
        return entity;
    }
}
