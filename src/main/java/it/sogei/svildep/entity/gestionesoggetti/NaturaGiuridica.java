package it.sogei.svildep.entity.gestionesoggetti;

import it.sogei.svildep.entity.base.BaseEntity;
import it.sogei.svildep.entity.enums.FlagCA;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_NATURE_GIURIDICHE")
public class NaturaGiuridica extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_NATURA_GIURIDICA")
    private Long id;
    @Column(name = "DATA_INIZIO_VALIDITA")
    private LocalDate dataInizioValidita;
    @Column(name = "DATA_FINE_VALIDITA")
    private LocalDate dataFineValidita;
    @Column(name = "DESC_DENOMINAZIONE_NATURA_GIURIDICA")
    private String denominazione;
    @Column(name = "FLAG_CHIUSURA_CA")
    @Enumerated(EnumType.STRING)
    private FlagCA flagChiusuraCA;
}
