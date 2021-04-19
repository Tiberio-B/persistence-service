package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionedepositi.DatoCatastale;
import it.sogei.svildep.entity.gestioneutenti.Rts;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_COMUNI")
public class Comune extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_COMUNE")
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
    @OneToMany(mappedBy = "comune")
    private List<DatoCatastale> datiCatastali;
    @OneToMany(mappedBy = "comune")
    private List<Rts> rtsList;
    @OneToMany(mappedBy = "comune")
    private List<Indirizzo> indirizzi;
    @OneToMany(mappedBy = "comuneNascita")
    private List<SoggettoFisico> soggettiFisici;
}
