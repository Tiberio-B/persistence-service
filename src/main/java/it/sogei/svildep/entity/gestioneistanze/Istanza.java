package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestionemodalitapagamento.ModalitaPagamento;
import it.sogei.svildep.entity.gestioneutenti.RTS;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_ISTANZE")
public class Istanza extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_ISTANZA")
    private Long id;

    @Column(name = "NUME_NUMERO_RICHIESTA")
    private Long numeroRichiesta;
    @Column(name = "DATA_RICHIESTA")
    private LocalDate dataRichiesta;

    @Column(name = "NUME_NUMERO_PROTOCOLLO")
    private Long numeroProtocollo;
    @Column(name = "DATA_PROTOCOLLO")
    private LocalDate dataProtocollo;
    @Column(name = "IMPO_IMPORTO_DEPOSITO")
    private Double importoDeposito;
    @Column(name = "DESC_CAUSALE_DEPOSITO")
    private String causaleDeposito;
    @Column(name = "DESC_DATI_PROCEDIMENTO_TRIBUNALE")
    private String datiProcedimentoTribunale;
    @Column(name = "IMPO_IMPORTO_RESTITUZIONE_DEPOSITO")
    private Double importoRestituzioneDeposito;
    @Column(name = "DESC_MOTIVAZIONE_INVIO_DST")
    private String motivazioneInvioDST;
    @Column(name = "FLAG_INSERIMENTO_MANUALE_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN inserimentoManuale;

    @ManyToOne
    @JoinColumn(name = "FK1_DEPOSITI_ISTANZE")
    private Deposito deposito;
    @ManyToOne
    @JoinColumn(name = "FK1_CATEGORIE_DEPOSITO_ISTANZE")
    private CategoriaDeposito categoriaDeposito;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_ISTANZA_ISTANZE")
    private TipoIstanza tipo;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_ISTANZA_ISTANZE")
    private StatoIstanza stato;
    @OneToOne
    @JoinColumn(name = "FK1_MODALITA_PAGAMENTO_ISTANZE")
    private ModalitaPagamento modalitaPagamento;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_INOLTRO_ISTANZE")
    private RTS rtsInoltro;
    @ManyToOne
    @JoinColumn(name = "FK2_RTS_COMPETENTE_ISTANZE")
    private RTS rtsCompetente;
//    @ManyToOne
//    @JoinColumn(name = "FK1_BENI_ESPROPRIATI_ISTANZE")
//    private BeneEspropriato beneEspropriato;
    @ManyToOne
    @JoinColumn(name = "FK1_DATI_CATASTALI_ISTANZE")
    private DatoCatastale datoCatastale;
    @ManyToOne
    @JoinColumn(name = "FK1_QUALITA_RICHIEDENTI_ISTANZE")
    private QualitaRichiedente qualitaRichiedente;
    @ManyToOne
    @JoinColumn(name = "FK1_OPERE_ISTANZE")
    private Opera opera;
    //TODO: serve il mandato? SI
}
