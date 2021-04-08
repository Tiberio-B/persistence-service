package it.sogei.svildep.mapper.istanza;

import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class IstanzaMapper implements EntityToDtoMapper<Istanza, IstanzaDto> {

    @Override
    public IstanzaDto mapEntityToDtoImpl(Istanza entity) {
        IstanzaDto dto = new IstanzaDto();
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));
        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));
        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());
        return dto;
    }

}

