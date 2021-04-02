package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoCoinvolgimento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_TIPI_COINVOLGIMENTO_SOGGETTO")
public class TipoCoinvolgimentoSoggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_COINVOLGIMENTO_SOGGETTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_COINVOLGIMENTO_SOGGETTO")
    private String descrizioneTipo;
    @Column(name = "CODI_CODICE_COINVOLGIMENTO")
    private FlagTipoCoinvolgimento flagTipoCoinvolgimento;
}
