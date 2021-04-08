package it.sogei.svildep.mapper.istanza.ricerca.istanza;

import it.sogei.svildep.dto.ricerca.istanza.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaDto;
import it.sogei.svildep.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.StatoIstanza;
import it.sogei.svildep.entity.gestioneistanze.TipoIstanza;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public abstract class RicercaIstanzaMapper<D extends RicercaIstanzaDto> implements DtoToEntityMapper<Istanza, D> {

    @Override
    public Istanza mapDtoToEntityImpl(D dto) throws RuntimeException {
        Istanza entity = new Istanza();

        String numeroRichiesta = dto.getNumeroRichiesta();
        if (numeroRichiesta != null) entity.setNumeroRichiesta(Long.parseLong(numeroRichiesta));

        String dataRichiesta = dto.getDataRichiesta();
        if (dataRichiesta != null) entity.setDataRichiesta(LocalDate.parse(dataRichiesta));

        String numeroProtocollo = dto.getNumeroProtocollo();
        if (numeroProtocollo != null) entity.setNumeroRichiesta(Long.parseLong(numeroProtocollo));

        String dataProtocollo = dto.getDataProtocollo();
        if (dataProtocollo != null) entity.setDataRichiesta(LocalDate.parse(dataProtocollo));

        String importoDeposito = dto.getImportoDeposito();
        if (importoDeposito != null) entity.setImportoDeposito(Double.parseDouble(importoDeposito));

        entity.setCausaleDeposito(dto.getCausaleDeposito());

        CategoriaDeposito categoriaDeposito = new CategoriaDeposito();
        String categoriaDepositoId = dto.getCategoriaDepositoId();
        if (categoriaDepositoId != null) categoriaDeposito.setId(Long.parseLong(categoriaDepositoId));
        entity.setCategoriaDeposito(categoriaDeposito);

        TipoIstanza tipoIstanza = new TipoIstanza();
        String tipoId = dto.getTipoId();
        if (tipoId != null) tipoIstanza.setId(Long.parseLong(tipoId));
        entity.setTipo(tipoIstanza);

        StatoIstanza statoIstanza = new StatoIstanza();
        String statoId = dto.getStatoId();
        if (statoId != null) statoIstanza.setId(Long.parseLong(statoId));
        entity.setStato(statoIstanza);

        return entity;
    }

    public List<Object> mapDtoToEntities(D dto) throws RuntimeException {
        Istanza istanzaRicerca = mapDtoToEntityImpl(dto);

        LocalDate dataDa = LocalDate.parse(dto.getDataDa());
        LocalDate dataA = LocalDate.parse(dto.getDataA());

        Long numeroDepositoNazionaleDa = Long.parseLong(dto.getNumeroDepositoNazionaleDa());
        Long numeroDepositoNazionaleA = Long.parseLong(dto.getNumeroDepositoNazionaleA());

        List<Object> entities = new ArrayList<>();
        entities.add(istanzaRicerca);
        entities.add(new LocalDate[]{dataDa, dataA});
        entities.add(new Long[]{numeroDepositoNazionaleDa, numeroDepositoNazionaleA});

        return entities;
    }

    public List<IstanzaTrovataDto> mapEntitiesToDtos(List<Istanza> entities) {
        List<IstanzaTrovataDto> dtos = new ArrayList<>();
        return dtos;
    }
}
