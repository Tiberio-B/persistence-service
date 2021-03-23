package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoggettoRepository extends JpaRepository<Soggetto, Long> {
}
