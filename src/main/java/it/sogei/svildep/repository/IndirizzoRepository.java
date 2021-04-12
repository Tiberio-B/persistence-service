package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.Indirizzo;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IndirizzoRepository extends JpaRepository<Indirizzo, Long> {

    Optional<Indirizzo> findBySoggetto(Soggetto soggetto);
}
