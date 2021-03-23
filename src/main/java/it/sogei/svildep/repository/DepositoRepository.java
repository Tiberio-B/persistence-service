package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestionedepositi.Deposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito, Long> {
}
