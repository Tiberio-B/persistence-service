package it.sogei.svildep.controller.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerDittaIndividualeDto;
import it.sogei.svildep.service.ricerca.RicercaIstanzaService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("istanze/ricercaPerDittaIndividuale")
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerDittaIndividualeController extends RicercaIstanzaController<RicercaIstanzaPerDittaIndividualeDto> {

    private final RicercaIstanzaService<RicercaIstanzaPerDittaIndividualeDto> service;


}
