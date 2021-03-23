package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_SOGGETTI")
public class Soggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SOGGETTO")
    private Long idSoggetto;
    @Column(name = "CODI_CODICE_FISCALE")
    private String codiceFiscale;
    @Column(name = "FLAG_CERTIFICATO_AT_SN")
    @Enumerated(EnumType.STRING)
    private FlagSN flagCertificatoAtSN;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_SOGGETTO_SOGGETTI")
    private TipoSoggetto tipoSoggetto;
}
