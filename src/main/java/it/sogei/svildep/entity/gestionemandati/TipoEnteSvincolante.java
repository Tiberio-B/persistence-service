package it.sogei.svildep.entity.gestionemandati;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_ENTE_SVINCOLANTE")
public class TipoEnteSvincolante extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_ENTE_SVINCOLANTE")
    private Long idTipoEnteSvincolante;
    @Column(name = "DESC_DESCRIZIONE_TIPO_ENTE_SVINCOLANTE")
    private Long descrizioneTipoEnteSvincolante;
}
