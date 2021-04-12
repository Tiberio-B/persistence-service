package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagTipoIstanza;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_ISTANZA")
public class TipoIstanza extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_ISTANZA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_TIPO_ISTANZA")
    private String descrizioneTipoIstanza;
    @Column(name = "CODI_CODICE_TIPO_ISTANZA")
    @Enumerated(EnumType.STRING)
    private FlagTipoIstanza codiceTipoIstanza;
}
