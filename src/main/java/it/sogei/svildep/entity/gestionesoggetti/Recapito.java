package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter
@Setter
@Entity
@Table(name = "D_RECAPITI")
public class Recapito extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_RECAPITO")
    private Long id;
    @Column(name = "TELE_TELEFONO")
    private String telefono;
    @Column(name = "INDI_PEC")
    private String pec;
    @Column(name = "INDI_EMAIL")
    private String email;
}
