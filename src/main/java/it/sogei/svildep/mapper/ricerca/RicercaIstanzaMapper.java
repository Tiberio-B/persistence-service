package it.sogei.svildep.mapper.ricerca;

import it.sogei.svildep.dto.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.entity.gestioneistanze.TipoIstanza;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class RicercaIstanzaMapper implements DtoToEntityMapper<Istanza, RicercaIstanzaDto> {

    @Override
    public Istanza mapDtoToEntityImpl(RicercaIstanzaDto dto) throws RuntimeException {
        Istanza entity = new Istanza();

        TipoIstanza tipoIstanza = new TipoIstanza();
        String tipoId = dto.getTipoId();
        if (tipoId != null) tipoIstanza.setId(Long.parseLong(tipoId));
        entity.setTipo(tipoIstanza);

        StatoIstanza statoIstanza = new StatoIstanza();
        String statoId = dto.getStatoId();
        if (statoId != null) statoIstanza.setId(Long.parseLong(statoId));
        entity.setStato(statoIstanza);

        CategoriaDeposito categoriaDeposito = new CategoriaDeposito();
        String categoriaDepositoId = dto.getCategoriaDepositoId();
        if (categoriaDepositoId != null) categoriaDeposito.setId(Long.parseLong(categoriaDepositoId));
        entity.setCategoriaDeposito(categoriaDeposito);

        return entity;
    }
}
