package it.sogei.svildep.mapper.dettaglio;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.IstanzaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@RequiredArgsConstructor
public class IstanzaDettaglioMapper extends IstanzaMapper<IstanzaDettaglioDto> {

    @Override
    public IstanzaDettaglioDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDettaglioDto dto = mapIstanzaToDto(entity, new IstanzaDettaglioDto());
        // dto.setSoggetti(entity.getCoinvolgimenti().forEach(coinvolgimento.getSoggetto()).toList()...); TO-DO
        return dto;
    }
}

