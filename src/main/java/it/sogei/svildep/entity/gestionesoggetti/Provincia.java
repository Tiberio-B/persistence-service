package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_PROVINCE")
public class Provincia extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PROVINCIA")
    private Long pkSequIdProvincia;
    @Column(name = "DESC_DENOMINAZIONE_PROVINCIA")
    private String descDenominazioneProvincia;
    @ManyToOne
    @JoinColumn(name = "FK1_REGIONI_PROVINCE")
    private Regione regione;
    @OneToMany(mappedBy = "provincia")
    private Set<Comune> listaComuni;
}
