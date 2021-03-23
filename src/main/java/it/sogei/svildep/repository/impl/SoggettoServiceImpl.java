package it.sogei.svildep.repository.impl;

import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.repository.SoggettoRepository;
import it.sogei.svildep.service.SoggettoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoggettoServiceImpl implements SoggettoService {

    private final SoggettoRepository repository;

    @Autowired
    public SoggettoServiceImpl(SoggettoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(Soggetto soggetto) {
        repository.save(soggetto);
    }
}
