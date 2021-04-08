package it.sogei.svildep.service.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerDittaIndividualeDto;
import it.sogei.svildep.mapper.istanza.ricerca.istanza.RicercaIstanzaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerDittaIndividualeService extends RicercaIstanzaService<RicercaIstanzaPerDittaIndividualeDto> {

    private final RicercaIstanzaMapper<RicercaIstanzaPerDittaIndividualeDto> mapper;

}
