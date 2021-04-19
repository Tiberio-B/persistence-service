package it.sogei.svildep.service;


import it.sogei.svildep.dto.dettaglio.IstanzaDettaglioDto;
import it.sogei.svildep.dto.ricerca.IstanzaTrovataDto;
import it.sogei.svildep.dto.ricerca.RicercaIstanzaDto;
import it.sogei.svildep.exception.SvildepException;
import it.sogei.svildep.repository.IstanzaRepository;

import java.util.List;

public interface IIstanzaService {

    IstanzaRepository getIstanzaRepository();

    List<IstanzaTrovataDto> getAll();

    IstanzaDettaglioDto get(Long id) throws SvildepException;

    List<IstanzaTrovataDto> find(RicercaIstanzaDto ricercaIstanzaDto) throws SvildepException;
}
