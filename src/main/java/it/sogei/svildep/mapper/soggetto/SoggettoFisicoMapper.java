package it.sogei.svildep.mapper.soggetto;

import it.sogei.svildep.dto.soggetto.SoggettoFisicoDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import it.sogei.svildep.mapper.RecapitoMapper;
import it.sogei.svildep.mapper.geo.NascitaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoFisicoMapper implements EntityToDtoMapper<SoggettoFisico, SoggettoFisicoDto> {

    private final RecapitoMapper recapitoMapper;
    private final NascitaMapper nascitaMapper;

    @Override
    public SoggettoFisicoDto mapEntityToDtoImpl(SoggettoFisico entity) {
        SoggettoFisicoDto dto = new SoggettoFisicoDto();
        dto.setCognome(entity.getCognome());
        dto.setNome(entity.getNome());
        dto.setSesso(entity.getFlagSessoMF().getDescrizione());
        dto.setDataDiNascita(entity.getDataNascita().toString());
        dto.setNascita(nascitaMapper.mapEntityToDto(entity));
        dto.setRecapito(recapitoMapper.mapEntityToDto(entity.getSoggetto().getRecapito()));
        return dto;
    }
}
