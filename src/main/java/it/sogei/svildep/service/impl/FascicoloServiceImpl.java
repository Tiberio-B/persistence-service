package it.sogei.svildep.service.impl;

import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.repository.FascicoloRepository;
import it.sogei.svildep.service.FascicoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FascicoloServiceImpl implements FascicoloService {

    private final FascicoloRepository repository;

    @Autowired
    public FascicoloServiceImpl(FascicoloRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(Fascicolo fascicolo) {
        repository.save(fascicolo);
    }
}
