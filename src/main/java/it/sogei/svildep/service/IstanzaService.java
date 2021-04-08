package it.sogei.svildep.service;


import it.sogei.svildep.dto.IstanzaDto;

import java.util.List;

public interface IstanzaService {

    List<IstanzaDto> getAll();

    IstanzaDto get(Long id);
}
