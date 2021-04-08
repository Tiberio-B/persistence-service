package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestionesoggetti.Soggetto;
import it.sogei.svildep.entity.gestionesoggetti.SoggettoUlteriore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_COINVOLGIMENTI_SOGGETTO")
public class CoinvolgimentoSoggetto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_COINVOLGIMENTO_SOGGETTO")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_COINVOLGIMENTI_SOGGETTO")
    private Soggetto soggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_ISTANZE_COINVOLGIMENTI_SOGGETTO")
    private Istanza istanza;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_COINVOLGIMENTO_SOGGETTO_COINVOLGIMENTI_SOGGETTO")
    private TipoCoinvolgimentoSoggetto tipoCoinvolgimentoSoggetto;
    @ManyToOne
    @JoinColumn(name = "FK1_SOGGETTI_ULTERIORI_COINVOLGIMENTI_SOGGETTO")
    private SoggettoUlteriore soggettoUlteriore;
}
