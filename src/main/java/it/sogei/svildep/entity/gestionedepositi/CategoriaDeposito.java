package it.sogei.svildep.entity.gestionedepositi;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagCategoriaDeposito;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_CATEGORIE_DEPOSITO")
public class CategoriaDeposito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_CATEGORIA_DEPOSITO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_CATEGORIA_DEPOSITO")
    private String descrizioneCategoriaDeposito;
    @Column(name = "CODI_CODICE_CATEGORIA")
    private FlagCategoriaDeposito codiceCategoria;
}
