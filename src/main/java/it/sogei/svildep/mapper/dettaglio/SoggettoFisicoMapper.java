package it.sogei.svildep.mapper.dettaglio;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioSoggettoFisicoDto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import it.sogei.svildep.mapper.common.NascitaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SoggettoFisicoMapper extends SoggettoMapper<SoggettoFisico, IstanzaDettaglioSoggettoFisicoDto> {

    private final NascitaMapper nascitaMapper;

    @Override
    public IstanzaDettaglioSoggettoFisicoDto mapEntityToDtoImpl(SoggettoFisico entity) {
        IstanzaDettaglioSoggettoFisicoDto dto = mapSoggettoToDto(entity.getSoggetto(), new IstanzaDettaglioSoggettoFisicoDto());
        dto.setCognome(entity.getCognome());
        dto.setNome(entity.getNome());
        dto.setSesso(entity.getFlagSessoMF().getDescrizione());
        dto.setDataDiNascita(entity.getDataNascita().toString());
        dto.setNascita(nascitaMapper.mapEntityToDto(entity));
        return dto;
    }
}
