package it.sogei.svildep.entity.gestioneincameramenti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_INCAMERAMENTO")
public class StatoIncameramento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_INCAMERAMENTO")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_INCAMERAMENTO")
    private String descrizioneStatoIncameramento;
}
