package it.sogei.svildep.entity.gestionemodalitapagamento;

import it.sogei.svildep.entity.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter
@Entity
@Table(name = "D_MODALITA_PAGAMENTO")
public class ModalitaPagamento extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "PK_SEQU_ID_MODALITA_PAGAMENTO")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "FK1_TIPI_MODALITA_PAGAMENTO_MODALITA_PAGAMENTO")
    private TipoModalitaPagamento tipoModalitaPagamento;
}
