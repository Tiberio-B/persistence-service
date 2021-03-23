package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagBC;
import it.sogei.svildep.entity.enums.FlagSN;
import it.sogei.svildep.entity.gestioneutenti.RTS;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_DEPOSITI")
public class Deposito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_DEPOSITO")
    private Long idDeposito;
    @Column(name = "DATA_APERTURA_DEPOSITO")
    private LocalDate dataAperturaDeposito;
    @Column(name = "IMPO_IMPORTO_INIZIALE")
    private Double importoIniziale;
    @Column(name = "NUME_NUMERO_NAZIONALE")
    private Long numeroNazionale;
    @Column(name = "NUME_NUMERO_LOCALE")
    private Long numeroLocale;
    @Column(name = "FLAG_SPECIE_BC")
    @Enumerated(EnumType.STRING)
    private FlagBC flagSpecieBC;
    @Column(name = "IMPO_IMPORTO_INTERESSI_ANTE_2001")
    private Double importoInteressiAnte2001;
    @Column(name = "FLAG_VERIFICA_ANTE_2001_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagVerificaAnte2001SN;
    @Column(name = "FLAG_ISCRIZIONE_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagIscrizioneSN;
    @Column(name = "FLAG_FRUTTIFERO_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagFruttiferoSN;
    @Column(name = "FLAG_INTERESSI_PERIODICI_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagInteressiPeriodiciSN;
    @Column(name = "FLAG_BOLLI_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagBolliSN;
    @Column(name = "FLAG_MARCHE_DA_BOLLO_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagMarcheDaBolloSN;
    @Column(name = "FLAG_ESPROPRIO_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagEsproprioSN;
    @Column(name = "DESC_NOTE")
    private String note;
    @Column(name = "NUME_ID_DEPOSITO_OLD")
    private Long idDepositoOld;
    @Column(name = "NUME_ID_PAGOPA")
    private Long idPagoPA;
    @Column(name = "DATA_PERFEZIONAMENTO")
    private LocalDate dataPerfezionamento;
    @Column(name = "IMPO_IMPORTO_VERSAMENTO")
    private Double importoVersamento;
    @Column(name = "CODI_LP_NUMERO_LIBRETTO")
    private String numeroLibretto;
    @Column(name = "CODI_LP_NUMERO_REGISTRO")
    private String numeroRegistro;
    @Column(name = "CODI_LP_NUMERO_FASCICOLO")
    private String numeroFascicolo;
    @Column(name = "PERS_LP_NOMINATIVO_BENEFICIARIO")
    private String nominativoBeneficiario;
    @OneToOne
    @JoinColumn(name = "FK1_VERSANTI_DEPOSITI")
    private Versante versante;
    @OneToOne
    @JoinColumn(name = "FK1_DATI_CATASTALI_DEPOSITI")
    private DatoCatastale datoCatastale;
    @OneToOne
    @JoinColumn(name = "FK1_DEPOSITI_DEPOSITI_COLLEGATO")
    private Deposito depositoCollegato;
    @ManyToOne
    @JoinColumn(name = "FK1_STATI_DEPOSITO_DEPOSITI")
    private StatoDeposito statoDeposito;
    @ManyToOne
    @JoinColumn(name = "FK1_CATEGORIE_DEPOSITO_DEPOSITI")
    private CategoriaDeposito categoriaDeposito;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_COSTITUZIONE_DEPOSITI")
    private RTS rtsCostituzione;
    @ManyToOne
    @JoinColumn(name = "FK2_RTS_COMPETENTE_DEPOSITI")
    private RTS rtsCompetente;
}
