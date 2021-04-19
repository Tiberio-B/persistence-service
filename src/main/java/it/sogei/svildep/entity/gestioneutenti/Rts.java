package it.sogei.svildep.entity.gestioneutenti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.Deposito;
import it.sogei.svildep.entity.gestionedocumenti.Fascicolo;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import it.sogei.svildep.entity.gestionesoggetti.Recapito;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_RTS")
public class Rts extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_RTS")
    private Long id;
    @Column(name = "DESC_DENOMINAZIONE_RTS")
    private String denominazioneRTS;
    @ManyToOne
    @JoinColumn(name = "FK1_COMUNI_RTS")
    private Comune comune;
    @OneToOne
    @JoinColumn(name = "FK1_RECAPITI_RTS")
    private Recapito recapito;
    @OneToMany(mappedBy = "rtsInoltro")
    private List<Istanza> istanzeInoltro;
    @OneToMany(mappedBy = "rtsCompetente")
    private List<Istanza> istanzeCompetenti;
    @OneToMany(mappedBy = "rtsCostituzione")
    private List<Deposito> depositiCostituzione;
    @OneToMany(mappedBy = "rtsCompetente")
    private List<Deposito> depositoCompetente;
    @OneToMany(mappedBy = "rts")
    private List<Fascicolo> fascicoli;
    @OneToMany(mappedBy = "rts")
    private List<Utente> utenti;
}
