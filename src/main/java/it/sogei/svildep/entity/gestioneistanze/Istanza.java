package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.CategoriaDeposito;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestionedepositi.DirittoSoggetto;
import it.sogei.svildep.entity.gestionemodalitapagamento.ModalitaPagamento;
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
    private Long idIstanza;
    @Column(name = "NUME_NUMERO_RICHIESTA")
    private Long numeroRichiesta;
    @Column(name = "NUME_NUMERO_PROTOCOLLO")
    private Long numeroProtocollo;
    @Column(name = "DATA_PROTOCOLLO")
    private LocalDate dataProtocollo;
    @Column(name = "CODI_CODICE_PAGOPA")
    private String codicePagoPA;
    @Column(name = "IMPO_IMPORTO_DEPOSITO")
    private Long importoDeposito;
    @Column(name = "DESC_CAUSALE_DEPOSITO")
    private String causaleDeposito;
    @Column(name = "DESC_DAT_PROCEDIMENTO_TRIBUNALE")
    private String datProcedimentoTribunale;
    @Column(name = "IMPO_IMPORTO_RESTITUZIONE_DEPOSITO")
    private Double importoRestituzioneDeopsito;
    @Column(name = "DESC_MOTIVAZIONE_INVIO_DST")
    private String motivazioneInvioDST;
    @ManyToOne
    @JoinColumn(name = "FK1_DEPOSITI_ISTANZE")
    private Deposito deposito;
    @ManyToOne
    @JoinColumn(name = "FK1_DATI_CATASTALI_ISTANZE")
    private DatoCatastale datoCatastale;
    @ManyToOne
    @JoinColumn(name = "FK1_CATEGORIE_DEPOSITO_ISTANZE")
    private CategoriaDeposito categoriaDeposito;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_ISTANZA_ISTANZE")
    private TipoIstanza tipoIstanza;
    @ManyToOne
    @JoinColumn(name = "FK1_DIRITTO_SOGGETTO_RICHIEDENTE_ISTANZE")
    private DirittoSoggetto richiedente;
    @ManyToOne
    @JoinColumn(name = "FK2_DIRITTO_SOGGETTO_PROPRIETARIO_ISTANZE")
    private DirittoSoggetto proprietario;
    @ManyToOne
    @JoinColumn(name = "FK3_DIRITTO_SOGGETTO_PROPRIETARIO_ISTANZE")
    private DirittoSoggetto altroProprietario;
    @ManyToOne
    @JoinColumn(name = "FK4_DIRITTO_SOGGETTO_CAUZIONATO_ISTANZE")
    private DirittoSoggetto enteCauzionato;
    @ManyToOne
    @JoinColumn(name = "FK5_DIRITTO_SOGGETTO_DEPOSITANTE_ISTANZE")
    private DirittoSoggetto depositanteLegale;
    @ManyToOne
    @JoinColumn(name = "FK6_DIRITTO_SOGGETTO_ESPROPRIANTE_ISTANZE")
    private DirittoSoggetto espropriante;
    @ManyToOne
    @JoinColumn(name = "FK7_DIRITTO_SOGGETTO_ENTE_ISTANZE")
    private DirittoSoggetto proprietarioEntePubblico;
    @ManyToOne
    @JoinColumn(name = "FK8_DIRITTO_SOGGETTO_EREDE_ISTANZE")
    private DirittoSoggetto erede;
    @OneToOne
    @JoinColumn(name = "FK1_MODALITA_PAGAMENTO_ISTANZE")
    private ModalitaPagamento modalitaPagamento;
    //TODO: serve il mandato? SI
}
