package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_SEDI")
public class Sede extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SEDE")
    private Long id;
    @Column(name = "NUME_PROGRESSIVO_SEDE")
    private Long progressivoSede;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_SEDE_SEDI")
    private TipoSede tipoSede;
    @ManyToOne
    @JoinColumn(name = "FK1_COMUNI_SEDI")
    private Comune comune;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_GIURIDICI_SEDI")
    private SoggettoGiuridico soggettoGiuridico;

}
