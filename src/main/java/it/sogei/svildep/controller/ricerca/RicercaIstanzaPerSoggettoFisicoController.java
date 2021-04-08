package it.sogei.svildep.controller.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerSoggettoFisicoDto;
import it.sogei.svildep.service.ricerca.RicercaIstanzaService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("istanze/ricercaPerSoggettoFisico")
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerSoggettoFisicoController extends RicercaIstanzaController<RicercaIstanzaPerSoggettoFisicoDto> {

    private final RicercaIstanzaService<RicercaIstanzaPerSoggettoFisicoDto> service;

}
