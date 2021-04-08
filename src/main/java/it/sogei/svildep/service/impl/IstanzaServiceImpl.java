package it.sogei.svildep.service.impl;

import it.sogei.svildep.dto.IstanzaDettaglioDto;
import it.sogei.svildep.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.repository.IstanzaRepository;
import it.sogei.svildep.service.IstanzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IstanzaServiceImpl implements IstanzaService {

    private final IstanzaRepository repository;

    private final IstanzaMapper istanzaMapper;

//    TODO: Dto diverso da quello di dettaglio, DA FARE
    public List<IstanzaDettaglioDto> getAll() {
        return istanzaMapper.mapEntityToDto(repository.findAll());
    }

    public IstanzaDettaglioDto get(Long id) {
        return istanzaMapper.mapEntityToDto(repository.findById(id).orElse(null));
    }


}
