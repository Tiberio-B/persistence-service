package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSessoMF;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoGiuridico;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_SOGGETTI_FISICI")
public class SoggettoFisico extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SOGGETTO_FISICO")
    private Long idSoggettoFisico;
    @Column(name = "PERS_NOME")
    private String nome;
    @Column(name = "PERS_COGNOME")
    private String cognome;
    @Column(name = "DATA_NASCITA")
    private LocalDate dataNascita;
    @Column(name = "FLAG_SESSO_MF")
    @Enumerated(EnumType.STRING)
    private FlagSessoMF flagSessoMF;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_SOGGETTI_FISICI")
    private Soggetto soggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_GIURIDICI_SOGGETTI_FISICI")
    private SoggettoGiuridico soggettoGiuridico;
}
