package it.sogei.svildep.service.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerSoggettoFisicoDto;
import it.sogei.svildep.mapper.istanza.ricerca.istanza.RicercaIstanzaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerSoggettoFisicoService extends RicercaIstanzaService<RicercaIstanzaPerSoggettoFisicoDto> {

    private final RicercaIstanzaMapper<RicercaIstanzaPerSoggettoFisicoDto> mapper;

}
