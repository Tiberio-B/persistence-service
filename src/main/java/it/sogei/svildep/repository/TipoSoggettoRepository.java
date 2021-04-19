package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionesoggetti.TipoSoggetto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSoggettoRepository extends JpaRepository<TipoSoggetto, Long> {

}
