package it.sogei.svildep.service;

import it.sogei.svildep.dto.IstanzaDettaglioDto;

import java.util.List;

public interface IstanzaService {

    List<IstanzaDettaglioDto> getAll();

    IstanzaDettaglioDto get(Long id);
}
