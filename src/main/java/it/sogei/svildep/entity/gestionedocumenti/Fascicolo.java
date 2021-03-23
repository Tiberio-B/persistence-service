package it.sogei.svildep.entity.gestionedocumenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestioneincameramenti.Incameramento;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionemandati.AccertamentoDM40;
import it.sogei.svildep.entity.gestionemandati.Mandato;
import it.sogei.svildep.entity.gestionepignoramenti.Pignoramento;
import it.sogei.svildep.entity.gestioneutenti.RTS;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_FASCICOLI")
public class Fascicolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_FASCICOLO")
    private Long pkSequIdFascicolo;
    @Column(name = "DESC_DESCRIZIONE_FILE")
    private String descDescrizioneFile;
    @Column(name = "CODI_ESTENSIONE_FILE")
    private String codiEstensioneFile;
    @Column(name = "DOC_DOCUMENTO_ALLEGATO")
    private byte[] docDocumentoAllegato;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_FASCICOLO_FASCICOLI")
    private StatoFascicolo statoFascicolo;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_FASCICOLI")
    private RTS rts;
    @ManyToOne
    @JoinColumn(name = "FK1_DEPOSITI_FASCICOLI")
    private Deposito deposito;
    @ManyToOne
    @JoinColumn(name = "FK1_ACCERTAMENTI_DM40_FASCICOLI")
    private AccertamentoDM40 accertamentoDM40;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_ALLEGATO_FASCICOLI")
    private TipoAllegato tipoAllegato;
    @ManyToOne
    @JoinColumn(name = "FK1_ISTANZE_FASCICOLI")
    private Istanza istanza;
    @ManyToOne
    @JoinColumn(name = "FK1_INCAMERAMENTI_FASCICOLI")
    private Incameramento incameramento;
    @ManyToOne
    @JoinColumn(name = "FK1_PIGNORAMENTI_FASCICOLI")
    private Pignoramento pignoramento;
    @ManyToOne
    @JoinColumn(name = "FK1_MANDATI_FASCICOLI")
    private Mandato mandato;

}
