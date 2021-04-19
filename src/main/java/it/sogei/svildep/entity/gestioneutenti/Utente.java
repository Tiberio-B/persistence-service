package it.sogei.svildep.entity.gestioneutenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_UTENTI")
public class Utente extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_UTENTE")
    private Long id;
    @Column(name = "PERS_NOME")
    private String nome;
    @Column(name = "PERS_COGNOME")
    private String cognome;
    @Column(name = "CODI_CODICE_FISCALE")
    private String codiceFiscale;
    @Column(name = "DATA_INIZIO")
    private LocalDate dataInizio;
    @Column(name = "DATA_FINE")
    private LocalDate dataFine;
    @Column(name = "FLAG_ABILITATO_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagAbilitatoSN;
    @ManyToOne
    @JoinColumn(name = "FK1_RUOLI_UTENTI")
    private Ruolo ruolo;
    @ManyToOne
    @JoinColumn(name = "FK1_RTS_UTENTI")
    private Rts rts;
    @ManyToOne
    @JoinColumn(name = "FK1_TITOLI_UTENTI")
    private Titolo titolo;
}
