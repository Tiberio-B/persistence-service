package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_DIRITTI_SOGGETTO")
public class DirittoSoggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_DIRITTO_SOGGETTO")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_DIRITTO_SOGGETTO_DIRITTI_SOGGETTO")
    private TipoDirittoSoggetto tipoDirittoSoggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_DIRITTI_SOGGETTO")
    private Soggetto soggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_DEPOSITI_DIRITTI_SOGGETTO")
    private Deposito deposito;
}
