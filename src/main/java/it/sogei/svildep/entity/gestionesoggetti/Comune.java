package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_COMUNI")
public class Comune extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_COMUNE_SEQ")
    private Long id;
    @Column(name = "DESC_SIGLA")
    private String sigla;
    @Column(name = "DESC_DENOMINAZIONE_COMUNE")
    private String denominazioneComune;
    @Column(name = "DATA_INIZIO_VALIDITA")
    private LocalDate dataInizioValidita;
    @Column(name = "DATA_FINE_VALIDITA")
    private LocalDate dataFineValidita;
    @Column(name = "CODI_COMUNE")
    private String comune;
    @ManyToOne
    @JoinColumn(name = "FK1_PROVINCE_COMUNI")
    private Provincia provincia;
}
