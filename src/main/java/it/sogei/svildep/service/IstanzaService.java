package it.sogei.svildep.service;

import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;

import java.util.List;

public interface IstanzaService {

    void insert(Istanza istanza, List<CoinvolgimentoSoggetto> coinvolgimenti);
}
