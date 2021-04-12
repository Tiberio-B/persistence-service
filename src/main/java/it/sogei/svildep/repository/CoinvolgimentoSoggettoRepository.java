package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinvolgimentoSoggettoRepository extends JpaRepository<CoinvolgimentoSoggetto, Long> {

    List<CoinvolgimentoSoggetto> findByIstanza(Istanza istanza);
}
