package it.sogei.svildep.mapper.dettaglio;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioSoggettoGiuridicoDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoGiuridicoMapper extends SoggettoMapper<SoggettoGiuridico, IstanzaDettaglioSoggettoGiuridicoDto> {

    @Override
    public IstanzaDettaglioSoggettoGiuridicoDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        IstanzaDettaglioSoggettoGiuridicoDto dto = mapSoggettoToDto(entity.getSoggetto(), new IstanzaDettaglioSoggettoGiuridicoDto());
        dto.setRagioneSociale(entity.getRagioneSociale());
        dto.setNaturaGiuridica(entity.getNaturaGiuridica().getDenominazioneNaturaGiuridica());
        dto.setPartitaIva(entity.getPartitaIVA());
        dto.setCciaa(entity.getCCIAA());
        dto.setDenominazione(entity.getDenominazioneDitta());
        return dto;
    }
}
