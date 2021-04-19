package it.sogei.svildep.mapper;

import it.sogei.svildep.dto.IstanzaDto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<D extends IstanzaDto> implements EntityToDtoMapper<Istanza, D> {

    @Override
    public abstract D mapEntityToDtoImpl(Istanza entity);

    public D mapIstanzaToDto(Istanza entity, D dto) {
        dto.setInserimentoManuale(entity.getInserimentoManuale().getDescrizione());
        dto.setNumeroRichiesta(String.valueOf(entity.getNumeroRichiesta()));
        dto.setDataRichiesta(String.valueOf(entity.getDataRichiesta()));
        dto.setNumeroProtocollo(String.valueOf(entity.getNumeroProtocollo()));
        dto.setDataProtocollo(String.valueOf(entity.getDataProtocollo()));
        dto.setImportoDeposito(String.valueOf(entity.getImportoDeposito()));
        dto.setCausaleDeposito(entity.getCausaleDeposito());
        dto.setCategoriaDeposito(entity.getCategoriaDeposito().getDescrizioneCategoriaDeposito());
        dto.setStato(entity.getStato().getDescrizione());
        dto.setRtsRicevente(entity.getRtsInoltro().getDenominazioneRTS());
        dto.setRtsCompetente(entity.getRtsCompetente().getDenominazioneRTS());
        return dto;
    }

}

