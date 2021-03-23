package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FascicoloRepository extends JpaRepository<Fascicolo, Long> {
}
