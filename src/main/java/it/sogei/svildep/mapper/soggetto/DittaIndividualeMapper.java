package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.DittaIndividualeDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import org.springframework.stereotype.Component;

@Component
public class DittaIndividualeMapper implements EntityToDtoMapper<SoggettoGiuridico, DittaIndividualeDto> {

    @Override
    public DittaIndividualeDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        DittaIndividualeDto dittaIndividualeDto = new DittaIndividualeDto();
        dittaIndividualeDto.setPartitaIva(entity.getPartitaIVA());
        dittaIndividualeDto.setDenominazione(entity.getDenominazioneDitta());
        return dittaIndividualeDto;
    }
}
