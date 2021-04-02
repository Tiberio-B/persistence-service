package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagSN;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_SOGGETTI_ULTERIORI")
public class SoggettoUlteriore extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SOGGETTO_ULTERIORE")
    private Long id;
    @Column(name = "FLAG_NON_IDENTIFICATO_SN")
    private FlagSN nonIdentificato;
    @Column(name = "PERS_NOME")
    private String nome;
    @Column(name = "PERS_COGNOME")
    private String cognome;
    @Column(name = "CODI_CODICE_FISCALE")
    private String  codiceFiscale;
}
