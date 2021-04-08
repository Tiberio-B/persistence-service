package it.sogei.svildep.controller.ricerca;

import it.sogei.svildep.dto.ricerca.istanza.RicercaIstanzaPerSoggettoGiuridicoDto;
import it.sogei.svildep.service.ricerca.RicercaIstanzaService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("istanze/ricercaPerSoggettoGiuridico")
@RequiredArgsConstructor
@Getter
public class RicercaIstanzaPerSoggettoGiuridicoController extends RicercaIstanzaController<RicercaIstanzaPerSoggettoGiuridicoDto> {

    private final RicercaIstanzaService<RicercaIstanzaPerSoggettoGiuridicoDto> service;

}
