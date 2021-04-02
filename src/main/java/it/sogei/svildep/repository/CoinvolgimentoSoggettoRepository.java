package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestioneistanze.CoinvolgimentoSoggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinvolgimentoSoggettoRepository extends JpaRepository<CoinvolgimentoSoggetto, Long> {
}
