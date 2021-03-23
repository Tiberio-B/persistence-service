package it.sogei.svildep.repository.impl;

import it.sogei.svildep.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.repository.DirittoSoggettoRepository;
import it.sogei.svildep.service.DirittoSoggettoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirittoSoggettoServiceImpl implements DirittoSoggettoService {

    private final DirittoSoggettoRepository repository;

    @Autowired
    public DirittoSoggettoServiceImpl(DirittoSoggettoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(DirittoSoggetto dirittoSoggetto) {
        repository.save(dirittoSoggetto);
    }
}
