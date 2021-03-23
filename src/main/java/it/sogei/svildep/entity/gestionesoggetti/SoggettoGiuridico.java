package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_SOGGETTI_GIURIDICI")
public class SoggettoGiuridico extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SOGGETTO_GIURIDICO")
    private Long idSoggettoGiuridico;
    @Column(name = "PERS_RAGIONE_SOCIALE")
    private String ragioneSociale;
    @Column(name = "DESC_CCIAA")
    private String CCIAA;
    @Column(name = "CODI_PARTITA_IVA")
    private String partitaIVA;
    @Column(name = "DESC_DENOMINAZIONE_DITTA")
    private String denominazioneDitta;
    @OneToOne
    @JoinColumn(name = "FK1_SOGGETTI_SOGGETTI_GIURIDICI")
    private Soggetto soggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_NATURE_GIURIDICHE_SOGGETTI_GIURIDICI")
    private NaturaGiuridica naturaGiuridica;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_UNITA_SOGGETTI_GIURIDICI")
    private TipoUnita tipoUnita;
}
