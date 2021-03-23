package it.sogei.svildep.entity.gestionedocumenti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_TIPI_ALLEGATO")
public class TipoAllegato extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_TIPO_ALLEGATO")
    private Long idTipoAllegato;
    @Column(name = "DESC_DESCRIZIONE_TIPO_ALLEGATO")
    private String descrizioneTipoAllegato;
}
