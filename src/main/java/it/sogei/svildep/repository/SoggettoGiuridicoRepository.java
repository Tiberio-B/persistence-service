package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SoggettoGiuridicoRepository extends JpaRepository<SoggettoGiuridico, Long> {

    Optional<SoggettoGiuridico> findBySoggetto(Soggetto soggetto);
}
