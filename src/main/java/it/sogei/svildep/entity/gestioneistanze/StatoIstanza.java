package it.sogei.svildep.entity.gestioneistanze;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagStatoIstanza;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_STATI_ISTANZA")
public class StatoIstanza extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_STATO_ISTANZA")
    private Long id;
    @Column(name = "DESC_DESCRIZIONE_STATO_ISTANZA")
    private String descrizione;
    @Column(name = "CODI_CODICE_STATO_ISTANZA")
    @Enumerated(EnumType.STRING)
    private FlagStatoIstanza codice;
    @OneToMany(mappedBy = "stato")
    private List<Istanza> istanze;
}
