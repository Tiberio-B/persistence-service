package it.sogei.svildep.entity.gestionedepositi;


import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestioneistanze.Istanza;
import it.sogei.svildep.entity.gestioneistanze.ProprietarioCatastale;
import it.sogei.svildep.entity.gestionesoggetti.Comune;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_DATI_CATASTALI")
public class DatoCatastale extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_DATO_CATASTALE")
    private Long id;
    @Column(name = "DESC_SEZIONE_URBANA")
    private String sezioneUrbana;
    @Column(name = "DESC_FOGLIO")
    private String foglio;
    @Column(name = "DESC_SUBALTERNO")
    private String subalterno;
    @Column(name = "DESC_PARTICELLA")
    private String particella;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_CATASTO_DATI_CATASTALI")
    private TipoCatasto tipoCatasto;
    @ManyToOne
    @JoinColumn(name = "FK1_COMUNI_DATI_CATASTALI")
    private Comune comune;
    @OneToOne(mappedBy = "datoCatastale")
    private Deposito deposito;
    @OneToMany(mappedBy = "beneEspropriato")
    private List<Istanza> istanze;
    @OneToMany(mappedBy = "beneEspropriato")
    private List<ProprietarioCatastale> proprietari;
}
