package it.sogei.svildep.service.impl;

import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.repository.CoinvolgimentoSoggettoRepository;
import it.sogei.svildep.repository.IstanzaRepository;
import it.sogei.svildep.service.IstanzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IstanzaServiceImpl implements IstanzaService {

    private final IstanzaRepository istanzaRepository;
    private final CoinvolgimentoSoggettoRepository coinvolgimentiRepository;

    @Override
    @Transactional
    public void insert(Istanza istanza, List<CoinvolgimentoSoggetto> coinvolgimenti) {
        istanzaRepository.saveAndFlush(istanza);
        for (CoinvolgimentoSoggetto coinvolgimentoSoggetto : coinvolgimenti) {
            coinvolgimentoSoggetto.setIstanza(istanza);
            coinvolgimentiRepository.save(coinvolgimentoSoggetto);
        }
    }
}
