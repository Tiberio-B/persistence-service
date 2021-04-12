package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.Sede;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Long> {

    Optional<Sede> findBySoggettoGiuridico(SoggettoGiuridico soggettoGiuridico);
}
