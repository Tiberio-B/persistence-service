package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.gestioneistanze.Opera;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_REGIONI")
public class Regione extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_REGIONE")
    private Long id;
    @Column(name = "DESC_DENOMINAZIONE_REGIONE")
    private String denominazioneRegione;
    @OneToMany(mappedBy = "regione")
    private List<Provincia> listaProvince;
    @OneToMany(mappedBy = "regione")
    private List<Opera> opere;
}
