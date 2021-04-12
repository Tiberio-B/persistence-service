package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.SoggettoGiuridicoDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import it.sogei.svildep.mapper.RecapitoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoGiuridicoMapper implements EntityToDtoMapper<SoggettoGiuridico, SoggettoGiuridicoDto> {

    private final RecapitoMapper recapitoMapper;

    @Override
    public SoggettoGiuridicoDto mapEntityToDtoImpl(SoggettoGiuridico entity) {
        SoggettoGiuridicoDto dto = new SoggettoGiuridicoDto();
        dto.setRagioneSociale(entity.getRagioneSociale());
        dto.setNaturaGiuridica(entity.getNaturaGiuridica().getDenominazioneNaturaGiuridica());
        dto.setPartitaIva(entity.getPartitaIVA());
        dto.setCciaa(entity.getCCIAA());
        dto.setDenominazione(entity.getDenominazioneDitta());
        dto.setRecapito(recapitoMapper.mapEntityToDto(entity.getSoggetto().getRecapito()));
        return dto;
    }
}
