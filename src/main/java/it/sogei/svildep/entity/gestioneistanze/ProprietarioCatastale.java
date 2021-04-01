package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionesoggetti.TipoSoggetto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_PROPRIETARI_CATASTALI")
public class ProprietarioCatastale extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PROPRIETARIO_CATASTALE")
    private Long id;
    @Column(name = "DESC_NOMINATIVO_PROPRIETARIO_CATASTALE")
    private String nominativoProprietario;
    @Column(name = "CODI_CF_PIVA")
    private String cfPiva;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_SOGGETTO_PROPRIETARI_CATASTALI")
    private TipoSoggetto tipoSoggetto;

}
