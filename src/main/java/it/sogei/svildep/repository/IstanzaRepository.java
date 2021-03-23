package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestioneistanze.Istanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IstanzaRepository extends JpaRepository<Istanza, Long> {
}
