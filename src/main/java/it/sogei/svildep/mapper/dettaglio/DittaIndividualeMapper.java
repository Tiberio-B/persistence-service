package it.sogei.svildep.mapper.dettaglio;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioDittaIndividualeDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import org.springframework.stereotype.Component;

@Component
public class DittaIndividualeMapper extends SoggettoMapper<SoggettoGiuridico, IstanzaDettaglioDittaIndividualeDto> {

    @Override
    public IstanzaDettaglioDittaIndividualeDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        IstanzaDettaglioDittaIndividualeDto dto = mapSoggettoToDto(entity.getSoggetto(), new IstanzaDettaglioDittaIndividualeDto());
        dto.setPartitaIva(entity.getPartitaIVA());
        dto.setDenominazione(entity.getDenominazioneDitta());
        return dto;
    }
}
