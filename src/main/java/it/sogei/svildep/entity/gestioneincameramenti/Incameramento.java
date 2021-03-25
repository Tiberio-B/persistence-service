package it.sogei.svildep.entity.gestioneincameramenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.entity.gestioneutenti.RTS;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_INCAMERAMENTI")
public class Incameramento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_INCAMERAMENTO")
    private Long id;
    @Column(name = "CODI_NUMERO_PROTOCOLLO_RICHIESTA_INCAMERAMENTO")
    private String numeroProtocolloRichiestaIncameramento;
    @Column(name = "DATA_PROTOCOLLO_RICHIESTA_INCAMERAMENTO")
    private LocalDate dataProtocolloRichiestaIncameramento;
    @Column(name = "IMPO_IMPORTO_DA_INCAMERARE")
    private Double importoDaIncamerare;
    @ManyToOne
    @JoinColumn(name = "FK1_DEPOSITI_INCAMERAMENTI")
    private Deposito deposito;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_INCAMERAMENTI")
    private RTS rts;
    @ManyToOne
    @JoinColumn(name = "FK1_DIRITTI_SOGGETTO_INCAMERAMENTI")
    private DirittoSoggetto dirittoSoggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_INCAMERAMENTO_INCAMERAMENTI")
    private StatoIncameramento statoIncameramento;
}
