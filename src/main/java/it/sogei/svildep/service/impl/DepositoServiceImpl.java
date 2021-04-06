package it.sogei.svildep.service.impl;

import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.repository.DepositoRepository;
import it.sogei.svildep.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositoServiceImpl implements DepositoService {

    private final DepositoRepository repository;

    @Autowired
    public DepositoServiceImpl(DepositoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(Deposito deposito) {
        repository.save(deposito);
    }
}
