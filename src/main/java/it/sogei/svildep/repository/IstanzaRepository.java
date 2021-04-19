package it.sogei.svildep.repository;

import it.sogei.svildep.entity.gestioneistanze.Istanza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IstanzaRepository extends JpaRepository<Istanza, Long> {

    @Query("select i from Istanza i join fetch i.deposito as d where " +
            "(:dataDa is null or i.dataRichiesta >= :dataDa) " +
            "and (:dataA is null or i.dataRichiesta <= :dataA) " +
            "and (:numeroDepositoNazionaleDa is null or d.numeroNazionale >= :numeroDepositoNazionaleDa) " +
            "and (:numeroDepositoNazionaleA is null or d.numeroNazionale <= :numeroDepositoNazionaleA) "
    )
    List<Istanza> findByQuery(@Param("dataDa") LocalDate dataDa, @Param("dataA") LocalDate dataA,
                              @Param("numeroDepositoNazionaleDa") long numeroDepositoNazionaleDa, @Param("numeroDepositoNazionaleA") long numeroDepositoNazionaleA);

//    @Query("select i from Istanza i join fetch i.categoriaDeposito as c, i.deposito as d, i.tipo as t, i.stato as s where " +
//            "(:dataDa is null or i.dataRichiesta >= :dataDa) " +
//            "and (:dataA is null or i.dataRichiesta <= :dataA) " +
//            "and (:numeroDepositoNazionaleDa is null or d.numeroNazionale >= :numeroDepositoNazionaleDa) " +
//            "and (:numeroDepositoNazionaleA is null or d.numeroNazionale <= :numeroDepositoNazionaleA) "
//            "and (:tipoId is null or t.id == :tipoId) " +
//            "and (:statoId is null or s.id == :statoId) " +
//            "and (:categoriaDepositoId is null or c.id == :categoriaDepositoId) " +
//            "and (:inserimentoManuale is null or i.inserimentoManuale == :inserimentoManuale) ")
//    )
//    List<Istanza> findByQuery(@Param("dataDa") LocalDate dataDa, @Param("dataA") LocalDate dataA,
//                              @Param("numeroDepositoNazionaleDa") long numeroDepositoNazionaleDa, @Param("numeroDepositoNazionaleA") long numeroDepositoNazionaleA,
//                              @Param("tipoId") long tipoId, @Param("statoId") long statoId, @Param("categoriaDepositoId") long categoriaDepositoId,
//                              @Param("inserimentoManuale") FlagSN inserimentoManuale);
}
