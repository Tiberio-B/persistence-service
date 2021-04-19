package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_DEPOSITO")
public class StatoDeposito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_DEPOSITO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_DEPOSITO")
    private String descrizioneStatoDeposito;
    @OneToMany(mappedBy = "statoDeposito")
    private List<Deposito> depositi;
}
