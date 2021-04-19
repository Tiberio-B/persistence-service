package it.sogei.svildep.mapper.ricerca;

import it.sogei.svildep.dto.ricerca.RicercaIstanzaPerSoggettoDto;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.mapper.DtoToEntityMapper;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@NoArgsConstructor
public class RicercaSoggettoMapper implements DtoToEntityMapper<Soggetto, RicercaIstanzaPerSoggettoDto> {


    @Override
    public Soggetto mapDtoToEntityImpl(RicercaIstanzaPerSoggettoDto dto) throws RuntimeException {
        Soggetto entity = new Soggetto();
        entity.setCodiceFiscale(dto.getCodiceFiscale());
        return entity;
    }
}
