package it.sogei.svildep.service.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerSoggettoGiuridicoDto;
import it.sogei.svildep.mapper.istanza.ricerca.istanza.RicercaIstanzaMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerSoggettoGiuridicoService extends RicercaIstanzaService<RicercaIstanzaPerSoggettoGiuridicoDto> {

    private final RicercaIstanzaMapper<RicercaIstanzaPerSoggettoGiuridicoDto> mapper;

}
