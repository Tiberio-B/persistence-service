package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SoggettoFisicoRepository extends JpaRepository<SoggettoFisico, Long> {

    Optional<SoggettoFisico> findBySoggetto(Soggetto soggetto);
}
