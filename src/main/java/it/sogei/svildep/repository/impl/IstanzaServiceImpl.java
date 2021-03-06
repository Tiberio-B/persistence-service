package it.sogei.svildep.repository.impl;

import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.repository.IstanzaRepository;
import it.sogei.svildep.service.IstanzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IstanzaServiceImpl implements IstanzaService {

    private final IstanzaRepository repository;

    @Autowired
    public IstanzaServiceImpl(IstanzaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(Istanza istanza) {
        repository.save(istanza);
    }
}
