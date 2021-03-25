package it.sogei.svildep.entity.gestionemandati;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_SVINCOLI")
public class Svincolo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_SVINCOLO")
    private Long id;
    @Column(name = "NUME_NUMERO_PROTOCOLLO")
    private Long numeroProtocollo;
    @Column(name = "DATA_SVINCOLO")
    private LocalDate dataSvincolo;
    @Column(name = "DESC_ENTE_SVINCOLANTE")
    private String enteSvincolante;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_ENTE_SVINCOLANTE_SVINCOLO")
    private TipoEnteSvincolante tipoEnteSvincolante;
}
