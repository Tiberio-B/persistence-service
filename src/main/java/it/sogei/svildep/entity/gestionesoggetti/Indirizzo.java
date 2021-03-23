package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_INDIRIZZI")
public class Indirizzo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_INDIRIZZO")
    private Long pkSequIdIndirizzo;
    @Column(name = "NUME_CIVICO")
    private String numeCivico;
    @Column(name = "INDI_INDIRIZZO")
    private String indiIndirizzo;
    @Column(name = "INDI_CAP")
    private String indiCap;
    @Column(name = "INDI_DETTAGLIO")
    private String indiDettaglio;
    @Column(name = "INDI_RIPARTIZIONE")
    private String indiRipartizione;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_INDIRIZZO_INDIRIZZI")
    private TipoIndirizzo tipoIndirizzo;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_INDIRIZZI")
    private Soggetto soggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_COMUNI_INDIRIZZI")
    private Comune comune;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_ESTERI_INDIRIZZI")
    private StatoEstero statoEstero;
}
