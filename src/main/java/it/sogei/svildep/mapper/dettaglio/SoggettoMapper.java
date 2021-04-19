package it.sogei.svildep.mapper.dettaglio;

import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioSoggettoDto;
import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.mapper.EntityToDtoMapper;
import it.sogei.svildep.mapper.common.RecapitoMapper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
public abstract class SoggettoMapper<E extends BaseEntity, D extends IstanzaDettaglioSoggettoDto> implements EntityToDtoMapper<E, D> {

    @Autowired private RecapitoMapper recapitoMapper;

    @Override
    public abstract D mapEntityToDtoImpl(E entity);

    public D mapSoggettoToDto(Soggetto entity, D dto) {
        dto.setRecapito(getRecapitoMapper().mapEntityToDto(entity.getRecapito()));
        return dto;
    }
}
