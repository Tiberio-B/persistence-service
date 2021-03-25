package it.sogei.svildep.entity.gestionepignoramenti;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_PIGNORAMENTI")
public class Pignoramento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_PIGNORAMENTO")
    private Long id;
    @Column(name = "DATA_NOTIFICA_PIGNORAMENTO")
    private LocalDate dataNotificaPignoramento;
}
